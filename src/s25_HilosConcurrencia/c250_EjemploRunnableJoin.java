package s25_HilosConcurrencia;

public class c250_EjemploRunnableJoin {


    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i+ "- " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) Math.random() * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" VOY DE VIAJE A " + Thread.currentThread().getName());
                System.out.println(main.getState());
            }
        };

        Thread v1 = new Thread(r,"Nuevo León");
        Thread v2 = new Thread(r,"Guadalajara");
        Thread v3 = new Thread(r,"Puebla");
        Thread v4 = new Thread(r,"Ciudad de Apizaco");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();
        Thread.sleep(10000);
        System.out.println("TERMINA LA EJECUCIÓN DE MAIN Y LOS RUNNABLE " + main.currentThread().getName());
    }
}
