package s27_Streams.ejercicios;
import java.util.stream.Stream;

public class t34_sumarProductos {
    public static void main(String[] args) {
        Producto pro1 = new Producto("Arroz", 10, 2); // 20
        Producto pro2 = new Producto("Celeral", 50, 4); // 200
        Producto pro3 = new Producto("Trocito de canela", 10, 6); // 60

        double total = Stream.of( pro1, pro2, pro3).map( pro -> {
            return pro.getPrecio() * pro.getCantidad();
        }).reduce((double) 0, (a, b) -> a + b);

        System.out.println("total de compra: " + total);

    }
}
