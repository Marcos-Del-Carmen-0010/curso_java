package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;
import s31_PatronesDisenio.abstracFactory.PizzeriaZonaAbstractFactory;

public class PizzeriaChilapaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    public PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "vegetariana" -> new PizzaChilapaVegetariana();
            case "peperoni" -> new PizzaChilapaPeperoni();
            case "italiana" -> new PizzaChilapaItaliana();
            default -> throw new IllegalStateException("Unexpected value: " + tipo);
        };
    }
}
