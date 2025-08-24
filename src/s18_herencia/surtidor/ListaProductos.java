package s18_herencia.surtidor;

public class ListaProductos {
    private Producto producto;
    private int cantidad;
    private double total;

    ListaProductos(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double calcularTotal(double precio, int cantidad) {
        this.total = precio * this.cantidad;
        return precio * cantidad;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        String d = "";
        if (producto.getStock() == 0) {
            d += "\nProducto " + producto.getNombre() + " no disponible";
        } else {
            double total = 0;
            d += producto.toString();
            total = calcularTotal(producto.getPrecio(), cantidad);
            d += "\nSub total: " + total + "\n";
        }
        return d;
    }
}
