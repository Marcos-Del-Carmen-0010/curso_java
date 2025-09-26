package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;
import s31_PatronesDisenio.abstracFactory.PizzeriaZonaAbstractFactory;

public class PizzeriaChilpancingoFactory extends PizzeriaZonaAbstractFactory {
    @Override
    public PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaChilpancingoVegetariana();
            case "peperoni" -> new PizzaChilpancingoPeperoni();
            case "italiana" -> new PizzaChilpancingoItaliana();
            default -> throw new IllegalStateException("Unexpected value: " + tipo);
        };
    }
}
