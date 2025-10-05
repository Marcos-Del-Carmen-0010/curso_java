package s31_PatronesDisenio.decoradorBebida;

public class Cafeteria {
    public static void main(String[] args) {
        Bebida cafeSimple = new Cafe();
        cafeSimple = new Azucar(cafeSimple);

        System.out.println("Pedido: " + cafeSimple.getDescripcion());
        System.out.println("Costo: " + cafeSimple.getCosto());

        Bebida cafeFresa = new Cafe();
        cafeFresa = new Leche(cafeFresa);
        cafeFresa = new Azucar(cafeFresa);
        cafeFresa = new Chocolate(cafeFresa);

        System.out.println("Pedido: " + cafeFresa.getDescripcion());
        System.out.println("Costo: " + cafeFresa.getCosto());
    }
}
