package s25_HilosConcurrencia;

public class c247_EjemploHilo {
    public static void main(String[] args) {
        Thread hilo = new NombreHilo("Marcos Del Carmen");
        hilo.start();
        System.out.println("Estado: " + hilo.getState());

        Thread hilo1 = new NombreHilo("Panfilo Perez");
        hilo1.start();
        Thread hilo2 = new NombreHilo("Juan Cruz Hernezto");
        hilo2.start();
    }
}
