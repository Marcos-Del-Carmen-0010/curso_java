package s25_HilosConcurrencia.ejemPanaderia;

import s25_HilosConcurrencia.ejemPanaderia.runnable.Consumidor;
import s25_HilosConcurrencia.ejemPanaderia.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class PanaderiaSanRafael {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                p.hornear("pan n° " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                p.consumir();
            }
        }).start();
    }
}
