package s25_HilosConcurrencia;

import java.util.concurrent.*;

public class c259_usoExecutorFuturePool {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

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

        Callable<Integer> taskRamdom = () -> {
            int resultado = (int) (Math.random() * 100);
            TimeUnit.SECONDS.sleep(5);
            return resultado;
        };

        Future<String> future = executor.submit(task);
        Future<String> future1 = executor.submit(task);
        Future<Integer> future2 = executor.submit(taskRamdom);

        executor.shutdown();
        System.out.println("Sigue la ejecución del metodo main 1");
        while (!(future.isDone() && future1.isDone() && future2.isDone())) {
            System.out.println(String.format("resultado 1 %s | resultado 2 %s | resultado 3 %s",
                    future.isDone() ? "finalizado" : "en proceso",
                    future1.isDone() ? "finalizado" : "en proceso",
                    future2.isDone() ? "finalizado" : "en proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("Resultado de la tarea1: " + future.get());
        System.out.println("Termina la hilo1: " + future.isDone());

        System.out.println("Resultado de la tarea2: " + future1.get());
        System.out.println("Termina la hilo2: " + future1.isDone());

        System.out.println("Resultado de la tarea3: " + future2.get());
        System.out.println("Termina la hilo3: " + future2.isDone());

    }
}
