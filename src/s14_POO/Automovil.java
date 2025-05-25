package s14_POO;

import java.util.Arrays;

public class Automovil implements Comparable<Automovil> {
    public int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private Persona persona;
    private Rueda[] ruedas;
    private TipoMotor tipo;
    private int indexRueda = 0;

    static String colorPatente = "naranja";
    static int capacidadEstanque = 500;
    static int ultimoId = 1;

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona persona) {
        this.id = ultimoId++;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.estanque = estanque;
        this.persona = persona;
        this.ruedas = new Rueda[5];
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public Motor getCilindrada() {
        return this.motor;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Color getColor() {
        return this.color;
    }

    public void setAtributos(TipoMotor tipo) {
        this.tipo = tipo;
    }

    public TipoMotor getAtributos() {
        return this.tipo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setCilindrada(Motor cilindrada) {
        this.motor = cilindrada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public String detalle() {
        String resultado = "";
        resultado += "......:::::: DATOS GENERALES" + "\n";
        resultado += "idCarro: " + id + "\n";
        resultado += "Fabricante: " + this.fabricante + "\n";
        resultado += "Modelo: " + this.modelo + "\n";
        resultado += "Color: " + this.color.getColor() + "\n";
        resultado += "Color patente: " + colorPatente + "\n";
        resultado += "......:::::: DATOS INTERNOS" + "\n";
        resultado += "Tipo : " + this.getAtributos().getNombre() + "\n";
        resultado += "Motor : " + this.motor.getCilindrada() + "\n";
        resultado += "Estanque : " + this.estanque.getCapacidad() + "\n";
        if (this.ruedas != null) {
            resultado += "Ruedas: \n";
            for (Rueda r : ruedas) {
                resultado += r.getFabricante() + ", " + r.getAro() + ", " + r.getAncho() + "\n";
            }
        }
        resultado += "......:::::: CONDUCTOR" + "\n";
        resultado += "Nombre y apellido : " + this.persona.getNombre() + " " + this.persona.getApellido() + "\n";
        return resultado;
    }

    public float calcularConsumo(int km, float porcentaje) {
        return km / (this.estanque.getCapacidad() * porcentaje);
    }

    public String acelerar(int rpm) {
        return "El auto " + this.modelo + " esta acelerando a " + rpm + " RPM\n";
    }

    public String frenar() {
        return "El auto " + this.modelo + " esta frenando.\n";
    }

    public String acelerarFrenar(int rpm) {
        String resultado = "";
        resultado += this.acelerar(rpm);
        resultado += this.frenar();
        return resultado;
    }

    public static float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadEstanque * (porcentajeBencina / 100f));
    }

    public void addRueda(Rueda rueda) {
        if(indexRueda < this.ruedas.length) {
            this.ruedas[indexRueda++] = rueda;
        }
    }

    @Override
    public String toString() {
        return this.id + ":"+ this.fabricante +" " + this.modelo;
    }

    @Override
    public int compareTo(Automovil auto) {
        return this.fabricante.compareTo(auto.getFabricante());
    }
}
