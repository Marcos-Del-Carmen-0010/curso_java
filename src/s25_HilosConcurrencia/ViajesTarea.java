package s25_HilosConcurrencia;

public class ViajesTarea implements Runnable {

    private String nombre;

    public ViajesTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {

        for (int i = 0; i < 6; i++) {
            System.out.println(i + " - " + nombre);
            try {
                Thread.sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Me voy de viaje a " + nombre);
    }
}
