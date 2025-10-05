package s31_PatronesDisenio.observer.calabosos;

import s31_PatronesDisenio.observer.Observable;

public class Jugador extends Observable {
    private String nameTag;
    private int puntosVidas;

    public Jugador(String nameTag, int puntosVidas) {
        this.nameTag = nameTag;
        this.puntosVidas = puntosVidas;
    }

    public String getNameTag() {
        return nameTag;
    }

    public int getVidas() {
        return puntosVidas;
    }

    public void danioPorAtaqueFisico(String enemigo, int ataque) {
        this.puntosVidas = this.puntosVidas - ataque;
        if (this.puntosVidas <= 0) {
            System.out.println(this.nameTag + " a muerto por " + enemigo);
        } else {
            System.out.println(enemigo + " ataco a " + this.nameTag + " le restan " + this.puntosVidas + " puntos de vida");
        }
        notifyObservers();
    }
}
