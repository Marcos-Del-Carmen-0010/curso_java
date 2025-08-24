package s20_pooInterfaces.catalogo;

import java.util.Date;

public abstract class Producto implements IProducto{
    public int precio;

    public Producto(int precio){
        this.precio = precio;
    }

    public int getPrecio() {
        return this.precio;
    }
}
