package s22_metodosGenricos;

public class BolsaProductos {
    public static void main(String[] args) {
        BolsaSupermercado<Fruta> pro1 = new AbtractBolsaSuperMercado<>();

        pro1.addProducto(new Fruta("Manzana", 40.90, 1.0,"Golden Red"));
        pro1.addProducto(new Fruta("Platano", 15.0, 2.5,"Amarilla"));
        pro1.addProducto(new Fruta("Piña", 35.0, 3.0,"Amarilla"));
        pro1.addProducto(new Fruta("Naranja", 24.50, 3.0,"Naranja"));

        System.out.println("LISTA DE FRUTAS EN LA BOLSA DE SUPER");
        pro1.getProductos().forEach(System.out::println);

        BolsaSupermercado<Lacteo> pro2 = new AbtractBolsaSuperMercado<>();
        pro2.addProducto(new Lacteo(10, 10, "Leche nutri", 24.50));
        pro2.addProducto(new Lacteo(20, 24, "Sata clara", 26.90));
        System.out.println("LISTA DE LACTEOS EN LA BOLSA");
        pro2.getProductos().forEach(System.out::println);

        BolsaSupermercado<NoPerecible> pro3 = new AbtractBolsaSuperMercado<>();
        pro3.addProducto( new NoPerecible("Frijoles", 10.1, 5, 20));
        pro3.addProducto( new NoPerecible("Arroz", 11.20, 10, 12));
        pro3.addProducto( new NoPerecible("Atún", 15.1, 23, 100));
        System.out.println("LISTA DE LACTEOS EN LA BOLSA");
        pro3.getProductos().forEach(System.out::println);

        BolsaSupermercado<Limpieza> pro4 = new AbtractBolsaSuperMercado<>();
        pro4.addProducto(new Limpieza("Fabuloso", 30.20, "Olor a flores", 1.5));
        pro4.addProducto(new Limpieza("Pinol", 24.50, "Olor a pinos", 1.6));
        pro4.addProducto(new Limpieza("Cloralex", 15.0, "Cloro", 1.0));
        System.out.println("LISTA DE LIMPIEZA EN LA BOLSA");
        pro4.getProductos().forEach(System.out::println);

    }
}
