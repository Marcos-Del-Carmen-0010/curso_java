package s25_HilosConcurrencia;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c261_ejemploScheledExecuteService {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(2);
        System.out.println("Alguna tarea en el main");
        executor.schedule(()->{
            System.out.println("Executando...");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 500, TimeUnit.MILLISECONDS);
        System.out.println("Alguna otra tarea en el main");
        executor.shutdown();
    }
}
