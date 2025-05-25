package s14_POO.OrdenPago;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Producto product1 = new Producto("Memoria USB 8 GB", 110, 2);
        Producto product2 = new Producto("Memoria RAM 32 GB", 2000, 2);
        Producto product3 = new Producto("Gabinete", 1500, 1);
        Producto product4 = new Producto("Teclado inalambrico", 450, 1);
        Producto product5 = new Producto("Mouse inalambrico", 320, 2);
        Producto product6 = new Producto("Router Wifi", 652.89, 3);
        Producto product7 = new Producto("Adaptador inalambrico", 150.0, 5);

        Cliente clt1 = new Cliente("Marcos", "Del Carmen");
        Cliente clt2 = new Cliente("Gustavo", "Flores");

        Producto list1[] = {product1, product4, product5};
        Date dat1 = new Date();
        OrdenCompra compra1 = new OrdenCompra("Kid inicial", dat1, clt1);
        compra1.addProducto(list1);
        System.out.println(compra1.detalleCompra(list1));

        Producto list2[] = {product3, product5, product4, product6};
        Date dat2 = new Date();
        OrdenCompra compra2 = new OrdenCompra("Kid premium", dat2, clt2);
        compra2.addProducto(list2);
        System.out.println(compra2.detalleCompra(list2));
    }
}
