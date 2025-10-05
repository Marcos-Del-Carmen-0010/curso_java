package s25_HilosConcurrencia;

public class c248_EjemploRunnable {
    public static void main(String[] args) {
        new Thread(new ViajesTarea("Nuevo León")).start();
        new Thread(new ViajesTarea("Guadalajara")).start();
        new Thread(new ViajesTarea("Puebla")).start();
        new Thread(new ViajesTarea("Ciudad de Apizaco")).start();
    }
}
