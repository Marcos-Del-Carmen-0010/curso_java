package s18_herencia.almacen;

public class Fruta extends Producto {
    private double peso;
    private String color;

    Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TIPO DE FRUTA" +
                super.toString() +
                "\nPeso:" + peso +
                "\nColor:" + color+
                "\n-----------------------------";
    }
}
