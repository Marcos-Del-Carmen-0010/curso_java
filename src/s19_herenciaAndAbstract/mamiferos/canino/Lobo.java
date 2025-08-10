package s19_herenciaAndAbstract.mamiferos.canino;

import s19_herenciaAndAbstract.mamiferos.Mamifero;

public class Lobo extends Canino {

    public int numCamada;
    public String especieLobo;

    public Lobo(int numCamada, String especieLobo, float tamanioColmillos, String color, String habitat, float altura, float largo, float peso) {
        super(tamanioColmillos, color, habitat, altura, largo, peso);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + this.especieLobo + " caza junto a su grupo de " + this.numCamada + " individuos en los bosques de " + this.habitad;
    }

    @Override
    public String dormir() {
        return "El Lobo " + this.color + " duerme en las cabernas de " + this.habitad;
    }

    @Override
    public String correr() {
        return "El Lobo " + this.especieLobo + " corre en las llanuras aledañas a los bosques de " + this.habitad;
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + this.especieLobo + " " + this.color + " aulla en luna llena";
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }
}
