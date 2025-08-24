package s22_metodosGenricos;

import java.util.List;

public interface BolsaSupermercado<T> {
    void addProducto(T t);
    List<T> getProductos();
}
