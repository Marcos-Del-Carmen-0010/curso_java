package s14_POO.OrdenPago;
import java.util.Date;

public class OrdenCompra {
    private int idCompra;
    private static int idFinal = 1;
    private String descripcion;
    private Date fechaCompra;
    private Cliente cliente;
    private Producto[] productos;

    OrdenCompra(String descripcion, Date fechaCompra, Cliente cliente) {
        this.idCompra = idFinal++;
        this.descripcion = descripcion;
        this.fechaCompra = fechaCompra;
        this.cliente = cliente;
    }

    public void addProducto(Producto[] productos) {
        this.productos = productos;
    }

    public String detalleCompra(Producto[] productos) {
        String result = "";
        double total = 0;
        result += "__________________________________________________\n";
        result += "ID: " + this.idCompra + "\n";
        result += " >>>>>>>>> " + this.descripcion + " <<<<<<<<<" +"\n";
        result += "__________________________________________________\n";
        for (int i = 0; i < productos.length; i++) {
            result += productos[i].getNombre() + "\t $ " + productos[i].getPrecio() + "\tcant:" + productos[i].getCantidad()+"\n";
            total += this.calcularTotal(productos[i].getPrecio(), productos[i].getCantidad());
        }
        result += "__________________________________________________\n";
        result += "Total: \t\t\t\t $ "+ total + "\n";
        result += "__________________________________________________\n";
        result += "Cliente: " + this.cliente.getNombre() + " " + this.cliente.getApellido() + "\n";
        result += "Fecha: " + this.fechaCompra.toString() + "\n";
        return result;
    }

    public double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

}
