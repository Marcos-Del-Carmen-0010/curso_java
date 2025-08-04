package s18_herencia.surtidor;
import java.util.Date;
public class Perecederos extends Producto {
    private Date caducidad;
    private int temperaturaMax;

    Perecederos(String nombre, String descripcion, int stock, double precio, Date caducidad, int temperaturaMax) {
        super(nombre, descripcion, stock, precio);
        this.caducidad = caducidad;
        this.temperaturaMax = temperaturaMax;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCaducidad: " + this.caducidad +
                "\nTemperatura Max: " + this.temperaturaMax + "°";
    }
}
