package s25_HilosConcurrencia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class c257_usoExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newCachedThreadPool();

        Runnable task = () -> {
            try {
                System.out.println("Iniciamos con el hilo " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin el hilo...");
        };

        executor.submit(task);
        executor.shutdown();
        System.out.println("Sigue la ejecución del metodo main 1");
        executor.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("Sigue la ejecución del metodo main 2");
    }
}
