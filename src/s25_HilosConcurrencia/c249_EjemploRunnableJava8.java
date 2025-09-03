package s25_HilosConcurrencia;

public class c249_EjemploRunnableJava8 {


    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i+ "- " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) Math.random() * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(" VOY DE VIAJE A " + Thread.currentThread().getName());
            }
        };

        new Thread(r,"Nuevo León").start();
        new Thread(r,"Guadalajara").start();
        new Thread(r,"Puebla").start();
        new Thread(r,"Ciudad de Apizaco").start();
    }
}
