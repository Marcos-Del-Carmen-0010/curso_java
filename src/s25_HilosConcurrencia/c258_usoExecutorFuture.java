package s25_HilosConcurrencia;

import java.util.concurrent.*;

public class c258_usoExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Callable<String> task = () -> {
            try {
                System.out.println("Iniciamos con el hilo " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            return "Resultado de la tarea";
        };

        Future<String> future = executor.submit(task);
        executor.shutdown();
        System.out.println("Sigue la ejecución del metodo main 1");
        while (!executor.isTerminated()) {
            System.out.println("ejecutando tarea");
            TimeUnit.MILLISECONDS.sleep(1500);
        }

        System.out.println("Resultado de la tarea: "+future.get());
        System.out.println("Termina la hilo: " + future.isDone());
    }
}
