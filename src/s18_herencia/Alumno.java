package s18_herencia;

public class Alumno extends Persona {
    private String intitucion;
    private double notaJava;
    private double notaPython;
    private double notaCalculo;

    Alumno(String nombre, String apellido, int edad) {}

    Alumno(String nombre, String apellido, int edad, String intitucion, double notaJava) {
        super(nombre, apellido, edad);
        this.intitucion = intitucion;
        this.notaJava = notaJava;
    }

    public String getIntitucion() {
        return intitucion;
    }

    public void setIntitucion(String intitucion) {
        this.intitucion = intitucion;
    }

    public double getNotaJava() {
        return notaJava;
    }

    public void setNotaJava(double notaJava) {
        this.notaJava = notaJava;
    }

    public double getNotaPython() {
        return notaPython;
    }

    public void setNotaPython(double notaPython) {
        this.notaPython = notaPython;
    }

    public double getNotaCalculo() {
        return notaCalculo;
    }

    public void setNotaCalculo(double notaCalculo) {
        this.notaCalculo = notaCalculo;
    }
}
