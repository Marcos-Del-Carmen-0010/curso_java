package s18_herencia.almacen;

public class NoPerecible extends Producto{
    private int contenido;
    private int calorias;

    NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "ALIMENTO NO PERECIBLE" +
                super.toString() +
                "\nContenido: " + this.contenido +
                "\nCalorias: " + this.calorias +
                "\n-----------------------------";
    }
}
