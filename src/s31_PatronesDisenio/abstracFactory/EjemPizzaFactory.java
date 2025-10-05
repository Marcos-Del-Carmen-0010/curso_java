package s31_PatronesDisenio.abstracFactory;

import s31_PatronesDisenio.abstracFactory.producto.PizzeriaChilapaFactory;

public class EjemPizzaFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory chilapa = new PizzeriaChilapaFactory();
        PizzeriaZonaAbstractFactory chilpancingo = new PizzeriaChilapaFactory();

        PizzaProducto pizza = chilapa.ordenarPizza("vegetariana");
        System.out.println("Marcos encargo una pizza " + pizza.getNombre());

        pizza = chilpancingo.ordenarPizza("peperoni");
        System.out.println("Roman encargo una pizza " + pizza.getNombre());

    }
}
