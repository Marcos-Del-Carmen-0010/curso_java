package s20_pooInterfaces.catalogo;

abstract public class Electronico extends Producto implements IElectronico {
    public String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
