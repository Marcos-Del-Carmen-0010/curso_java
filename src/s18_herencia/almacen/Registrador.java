package s18_herencia.almacen;

public class Registrador {
    public static void main(String[] args) {
        Lacteo pro1 = new Lacteo("Leche nutri",25D, 100, 50);
        Fruta pro2 = new Fruta("Manzana", 30D, 30, "Golden Red");
        Limpieza pro3 = new Limpieza("Cloro", 25D, "Cloruro de Sodio y Cloratos", 30);
        NoPerecible pro4 = new NoPerecible("Yogourt Griego Narutal",55D, 100, 35);

        Producto[] productos = new Producto[]{pro1, pro2, pro3, pro4};

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
