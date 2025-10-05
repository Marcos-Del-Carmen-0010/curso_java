package s25_HilosConcurrencia;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class c255_usoTimmer {
    public static void main(String[] args) {

        Timer timer = new Timer();
        System.out.println("Timer iniciando en " + new Date());
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("TimerTask executando en " + new Date() + " del hilo " + Thread.currentThread().getName());
                System.out.println("Timer finalizado...");
                timer.cancel();
            }
        }, 500);
    }
}
