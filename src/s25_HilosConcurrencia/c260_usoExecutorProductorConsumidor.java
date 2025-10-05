package s25_HilosConcurrencia;

import s25_HilosConcurrencia.ejemPanaderia.Panaderia;
import s25_HilosConcurrencia.ejemPanaderia.runnable.Consumidor;
import s25_HilosConcurrencia.ejemPanaderia.runnable.Panadero;

import java.util.concurrent.*;

public class c260_usoExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        System.out.println("Tamaño de pool: " + executor.getPoolSize());
        System.out.println("Tareas en cola: " + executor.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable productor = new Panadero(p);
        Runnable consumidor = new Consumidor(p);

        Future<?> futureProductor = executor.submit(productor);
        Future<?> futureConsumidor = executor.submit(consumidor);

        System.out.println("Tamaño de pool: " + executor.getPoolSize());
        System.out.println("Tareas en cola: " + executor.getQueue().size());

        executor.shutdown();
        System.out.println("Contuniamos con la ejecución del main");
    }
}
