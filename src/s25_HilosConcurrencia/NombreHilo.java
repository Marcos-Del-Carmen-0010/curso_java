package s25_HilosConcurrencia;

public class NombreHilo extends Thread {
    public NombreHilo(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("CORRE EL HILO");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2);
                System.out.println(this.getName() + " " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("EL HILO SE TERMINO");
    }


}
