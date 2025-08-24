package s19_herenciaAndAbstract.mamiferos.canino;

import s19_herenciaAndAbstract.mamiferos.Mamifero;

abstract public class Canino extends Mamifero {
    public float tamanioColmillo;
    public String color;

    public Canino() {}

    public Canino(float tamanioColmillo, String color, String habitad, float altura, float largo, float peso) {
        super(habitad, altura, largo, peso);
        this.color = color;
        this.tamanioColmillo = tamanioColmillo;
    }

    public String getColor() {
        return color;
    }

    public float getTamanioColmillo() {
        return tamanioColmillo;
    }
}
