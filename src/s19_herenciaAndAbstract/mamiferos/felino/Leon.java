package s19_herenciaAndAbstract.mamiferos.felino;

import s19_herenciaAndAbstract.mamiferos.Mamifero;

public class Leon extends Felino {

    public int numManada;
    public float potenciaRugidoDecibel;

    public Leon(int numManada, float potenciaRugidoDecibel, float tamanioGarras, String habitad, int velocidad, float altura, float largo, float peso) {
        super(tamanioGarras, velocidad, habitad, altura, largo, peso);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon caza junto a su grupo " + this.numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El leon duerme en las estepas africans";
    }

    @Override
    public String correr() {
        return "El leon corre a " + this.velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Leon ruge fuerte a " + this.potenciaRugidoDecibel + " decibeles";
    }
}
