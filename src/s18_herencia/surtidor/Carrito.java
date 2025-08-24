package s18_herencia.surtidor;

public class Carrito {
    private ListaProductos productos[];

    Carrito(ListaProductos productos[]) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        double total = 0;
        String d = "";
        for (ListaProductos producto : productos) {
            d += producto.toString();
            total += producto.getTotal();
        }
        d += "\nTotal de compra: " + total;
        return d;
    }
}
