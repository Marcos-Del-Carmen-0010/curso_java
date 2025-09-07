package s25_HilosConcurrencia;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class c256_usoTimmerPeriodico {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger counter = new AtomicInteger(3);
        Timer timer = new Timer();
        System.out.println("Timer iniciando en " + new Date());

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = counter.getAndDecrement();
                if (i > 0) {
                    System.out.println("TimerTask executando en " + new Date() + " del hilo " + Thread.currentThread().getName());
                    toolkit.beep();
                }else {
                    System.out.println("Timer finalizado...");
                    timer.cancel();
                }
            }
        }, 0, 10000);
    }
}
