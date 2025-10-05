package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;

public class PizzaChilpancingoPeperoni extends PizzaProducto {
    public PizzaChilpancingoPeperoni() {
        super();
        nombre = "Chilpancingo Peperoni";
        masa = "Masa artesanal gruesa";
        salsa = "Salsa de jitomate con especias";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Peperoni extra");
        ingredientes.add("Orégano fresco");
        ingredientes.add("Aceitunas negras");
        ingredientes.add("Pimientos asados");
    }

    @Override
    public void cocinar() {
        System.out.println("Horneando pizza de peperoni a 220°C durante 18 minutos.");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas triangulares medianas.");
    }
}
