package s31_PatronesDisenio.abstracFactory.producto;

import s31_PatronesDisenio.abstracFactory.PizzaProducto;

public class PizzaChilpancingoVegetariana extends PizzaProducto {
    public PizzaChilpancingoVegetariana() {
        nombre = "Chilpancingo Vegana";
        masa = "Masa delgada de maíz";
        salsa = "Salsa de jitomate con chile guajillo";
        ingredientes.add("Queso vegano artesanal");
        ingredientes.add("Flor de calabaza");
        ingredientes.add("Rajas de chile poblano");
        ingredientes.add("Cebolla caramelizada");
        ingredientes.add("Elote tierno");
    }

    @Override
    public void cocinar() {
        System.out.println("Horneando en horno de piedra a 180°C por 20 minutos.");
    }

    @Override
    public void cortar() {
        System.out.println("Partiendo la pizza en porciones rectangulares al estilo chilpancingueño.");
    }
}
