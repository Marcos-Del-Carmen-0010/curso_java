package s18_herencia.compania;

public class Gerente extends Persona {
    private double presupuesto;

    Gerente(String nombre, String apellido, String numeroFiscal, Double presupuesto) {
        super(nombre, apellido, numeroFiscal);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPresupuesto: " + this.presupuesto +
               "\n------------------------------------";
    }
}