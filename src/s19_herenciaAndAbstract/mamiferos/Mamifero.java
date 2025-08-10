package s19_herenciaAndAbstract.mamiferos;

public abstract class Mamifero {
    public String habitad;
    public float altura;
    public float largo;
    public float peso;
    public String nombreCientifico;

    public Mamifero(String habitad, float altura, float largo, float peso, String nombreCientifico) {
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public Mamifero(String habitad, float altura, float largo, float peso) {
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    public Mamifero() {}

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

    public String getHabitad() {
        return habitad;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }
}
