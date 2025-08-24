package s22_metodosGenricos;

public class Lacteo extends Producto {
    public int cantidad;
    public int proteinas;

    public Lacteo(int cantidad, int proteinas, String nombre, Double precio) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Cantidad: " + cantidad + "\n"+
                "Proteinas:" + proteinas;
    }
}
