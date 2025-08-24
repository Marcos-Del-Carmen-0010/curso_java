package s19_herenciaAndAbstract.mamiferos.felino;

import s19_herenciaAndAbstract.mamiferos.Mamifero;

public class Gepardo extends Felino {

    public Gepardo(float tamanioGarras, int velocidad, String habitad, float altura, float largo, float peso) {
        super(tamanioGarras, velocidad, habitad, altura, largo, peso);
    }

    @Override
    public String comer() {
        return "El Gepardo caza junto a su grupo en las llanuras africanas, con un mordida mucho inferior a los demas felinos grandes.";
    }

    @Override
    public String dormir() {
        return "El Gepardo duerme en las estapas africanas";
    }

    @Override
    public String correr() {
        return "El Gepardo es el felino más rapido del mundo, corre a una velocidad " + this.velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El Gepardo ruge no tan fuerte como el Leon";
    }
}
