package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;

public class PizzaChilapaPeperoni extends PizzaProducto {
    public PizzaChilapaPeperoni() {
        super();
        nombre = "Chilapa Peperoni";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mosarela");
        ingredientes.add("Extra peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza en triángulos.");
    }

}
