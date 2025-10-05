package s31_PatronesDisenio.observer.notificaciones;

public class EjemploComporacion {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Gloogle", 2000);

        google.addObserver(obj -> {
            System.out.println("Marcos " + ((Corporacion) obj).getNombre() + "Actualizarón el precio: " + ((Corporacion) obj).getPrecio());
        });

        google.addObserver(obj -> {
            System.out.println("Damian " + ((Corporacion) obj).getNombre() + "Actualizaron el precio: " +((Corporacion) obj).getPrecio());
        });

        google.notifyObservers();
    }
}
