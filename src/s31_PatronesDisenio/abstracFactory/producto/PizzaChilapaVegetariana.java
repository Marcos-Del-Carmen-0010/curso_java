package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;

public class PizzaChilapaVegetariana extends PizzaProducto {
    public PizzaChilapaVegetariana() {
        super();
        nombre = "Chilapa Vegetariana";
        masa = "Masa Integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berejenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min a 2|5°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanas cuadradas");
    }

}
