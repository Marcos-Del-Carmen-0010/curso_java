package s19_herenciaAndAbstract.mamiferos.felino;

import s19_herenciaAndAbstract.mamiferos.Mamifero;

public class Tigre extends Felino {

    public String especie;

    public Tigre(String especie, float tamanioGarras, int velocidad, String habitad, float altura, float largo, float peso) {
        super(tamanioGarras, velocidad, habitad, altura, largo, peso);
        this.especie = especie;
    }

    @Override
    public String comer() {
        return "El Tigre " + this.especie + " caza solitario en los manglares y bosques monzónicos de " + this.habitad;
    }

    @Override
    public String dormir() {
        return "El Tigre " + this.especie + " duerme en la selvas de " + this.habitad;
    }

    @Override
    public String correr() {
        return "El Tigre " + this.especie + " corre a una velocidad " + this.velocidad + " km/hr";
    }

    @Override
    public String comunicarse() {
        return "El ruge tigre y agacha sus orejas";
    }

    public String getEspecie() {
        return especie;
    }
}
