package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;

public class PizzaChilpancingoItaliana extends PizzaProducto {
    public PizzaChilpancingoItaliana() {
        super();
        nombre = "Chilpancingo Italiana";
        masa = "Masa delgada y crujiente";
        salsa = "Salsa de tomate al estilo napolitano";
        ingredientes.add("Queso mozzarella fresco");
        ingredientes.add("Albahaca");
        ingredientes.add("Tomates cherry");
        ingredientes.add("Aceite de oliva extra virgen");
        ingredientes.add("Prosciutto");
    }

    @Override
    public void cocinar() {
        System.out.println("Horneando al estilo italiano a 250°C por 12 minutos.");
    }

    @Override
    public void cortar() {
        System.out.println("Rebanando en porciones delgadas para compartir.");
    }

}
