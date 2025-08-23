package s22_metodosGenricos;

import java.util.ArrayList;
import java.util.List;

public class AbtractBolsaSuperMercado<T extends Producto> implements BolsaSupermercado<T> {
    public List<T> listaProductos;

    public AbtractBolsaSuperMercado() {
        this.listaProductos  = new ArrayList<>();
    }

    @Override
    public void addProducto(T t) {
        this.listaProductos.add(t);
    }

    @Override
    public List<T> getProductos() {
        return this.listaProductos;
    }
}
