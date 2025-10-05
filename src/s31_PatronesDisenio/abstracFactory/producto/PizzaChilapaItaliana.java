package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;

public class PizzaChilapaItaliana extends PizzaProducto {
    public PizzaChilapaItaliana() {
        super();
        System.out.println("Clase concreta pizza chilapa italiana");
        nombre = "Chilapa Italiana";
        masa = "Masa Gruesa";
        salsa = "Salsa de tomate italiano carne";
        ingredientes.add("Queso monsarela");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza en triángulos grandes.");
    }

}
