package s25_HilosConcurrencia;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class c262_tareasProgramadas {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en el main");
        AtomicInteger counter = new AtomicInteger(5);
        Future<?> future = executor.scheduleAtFixedRate(()->{
            System.out.println("Executando...");
            try {
                TimeUnit.SECONDS.sleep(1);
                counter.decrementAndGet();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 1000, 2000, TimeUnit.MILLISECONDS);
        System.out.println("Alguna otra tarea en el main");


        while (counter.get() >= 0) {
            if (counter.get() == 0) {
                future.cancel(true);
                counter.decrementAndGet();
            }
        }
        System.out.println("otra tarea en el main");
        executor.shutdown();
    }
}
