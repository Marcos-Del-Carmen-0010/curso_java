package s31_PatronesDisenio.observer.calabosos;

public class AtaqueInfo {
    private String nombreEnemigo;
    private int puntosDanio;

    public AtaqueInfo(String nombreEnemigo, int puntosDanio) {
        this.nombreEnemigo = nombreEnemigo;
        this.puntosDanio = puntosDanio;
    }

    public String getNombreEnemigo() {
        return nombreEnemigo;
    }

    public int getPuntosDanio() {
        return puntosDanio;
    }
}
