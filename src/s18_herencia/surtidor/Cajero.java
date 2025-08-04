package s18_herencia.surtidor;

import java.util.Calendar;
import java.util.Date;

public class Cajero {
    public static void main(String[] args) {
        Date caducidad = new Date(125, Calendar.DECEMBER, 15);
        Date caducidad2 = new Date(126, Calendar.DECEMBER, 20);

        // lo que se tiene en tienda
        Perecederos pro1 = new Perecederos("Leche Entera", "Leche pasteurizada de vaca", 50, 22.5, caducidad, 4);
        Perecederos pro2 = new Perecederos("Queso Fresco", "Queso artesanal elaborado con leche entera", 30, 45.0, caducidad, 5);
        NoPerecederos pro3 = new NoPerecederos("Arroz Integral", "Arroz de grano largo sin conservadores", 100, 35.50, "1 kg", "Bolsa plástica");


        // los productos que se llevara el cliente
        ListaProductos lp1 = new ListaProductos(pro1, 3);
        ListaProductos lp2 = new ListaProductos(pro2, 4);
        ListaProductos lp3 = new ListaProductos(pro3, 4);

        Carrito car1 = new Carrito(new ListaProductos[] {lp1, lp2, lp3});

        System.out.println(car1.toString());

    }
}
