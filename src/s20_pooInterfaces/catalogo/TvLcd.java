package s20_pooInterfaces.catalogo;
/**
 * La clase TvLcd, poner especial atención en el extends de Electronico
 * y en el método que debe implementar getPrecioVenta(), su atributo
 * pulgada (int) con su respectivo método get y el constructor.
 * */
public class TvLcd extends Electronico implements IProducto {
    public int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio();
    }

    public int getPulgada() {
        return this.pulgada;
    }

}
