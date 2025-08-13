package s20_pooInterfaces.catalogo;
/**
 * La clase IPhone, poner especial atención en el extends de Electronico y en
 * el método que debe implementar getPrecioVenta() de la interface IProducto,
 * sus atributos color y modelo del tipo string con sus respectivos métodos
 * getter y el constructor.
 * */
public class IPhone extends Electronico implements IProducto {
    public String modelo;
    public String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }
}
