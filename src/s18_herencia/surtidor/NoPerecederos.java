package s18_herencia.surtidor;
import java.util.Date;

public class NoPerecederos extends Producto {
    private String contenido;
    private String tipoDeEmpaque;

    NoPerecederos(String nombre, String descripcion, int stock, double precio, String contenido, String tipoDeEmpaque) {
        super(nombre, descripcion, stock, precio);
        this.contenido = contenido;
        this.tipoDeEmpaque = tipoDeEmpaque;
    }

    public String getCaducidad() {
        return contenido;
    }

    public void setCaducidad(String contenido) {
        this.contenido = contenido;
    }

    public String getTemperaturaMax() {
        return tipoDeEmpaque;
    }

    public void setTemperaturaMax(String tipoDeEmpaque) {
        this.tipoDeEmpaque = tipoDeEmpaque;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nContenido: " + contenido
                + "\nTipo de empaque: " + tipoDeEmpaque;
    }
}
