package s18_herencia;

public class AlumnoInter extends  Alumno {
    private String pais;
    private double notaIdioma;

    AlumnoInter(String nombre, String apellido, int edad,String intitucion, double notaJava, String pais,double notaIdioma) {
        super(nombre, apellido, edad, intitucion, notaJava);
        this.pais = pais;
        this.notaIdioma = notaIdioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(double notaIdioma) {
        this.notaIdioma = notaIdioma;
    }
}
