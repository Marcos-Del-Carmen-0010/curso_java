package s25_HilosConcurrencia.ejemPanaderia;

import s25_HilosConcurrencia.ejemPanaderia.runnable.Consumidor;
import s25_HilosConcurrencia.ejemPanaderia.runnable.Panadero;

public class PanaderiaSanJose {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
