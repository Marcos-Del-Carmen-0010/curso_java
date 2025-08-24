package s19_herenciaAndAbstract.mamiferos.felino;

import s19_herenciaAndAbstract.mamiferos.Mamifero;

abstract public class Felino extends Mamifero {
    public float tamanioGarras;
    public int velocidad;

    public Felino(float tamanioGarras, int velocidad, String habitad, float altura, float largo, float peso) {
        super(habitad, altura, largo, peso);
        this.tamanioGarras = tamanioGarras;
        this.velocidad = velocidad;
    }

    public float getTamanioGarras() {
        return tamanioGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }


}
