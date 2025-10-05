package s31_PatronesDisenio.observer.sistemaClima;

import s31_PatronesDisenio.observer.Observable;

public class EstacionClima extends Observable {
    private String nombre;
    private int temperatura;

    public EstacionClima(String nombre, int temperatura) {
        this.nombre = nombre;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        System.out.println("La estación " + this.nombre + " detecto un cambio en la temperatura" +
                "\nahora es de " + this.temperatura + "°C");
        notifyObservers();
    }
}
