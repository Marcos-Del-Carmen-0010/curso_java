package s25_HilosConcurrencia.ejemPanaderia;

public class Panaderia {
    private String pan;
    private boolean disponible = false;


    public synchronized void hornear(String masa) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.pan = masa;
        System.out.println("Panaderia hornado: " + this.pan);
        disponible = true;
        notify();
    }

    public synchronized String consumir() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Cliente consume: " + this.pan);
        this.disponible = false;
        notify();
        return this.pan;
    }
}
