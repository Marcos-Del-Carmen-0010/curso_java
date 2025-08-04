package s18_herencia.surtidor;

public class Producto {
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;

    Producto(String nombre, String descripcion, int stock, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    Producto(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "\nPRODUCTO" +
                "\nNombre: " + nombre +
                "\nDescripcion: " + descripcion +
                "\nPrecio: " + precio;
    }
}
