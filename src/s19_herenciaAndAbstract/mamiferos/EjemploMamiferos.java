package s19_herenciaAndAbstract.mamiferos;

import s19_herenciaAndAbstract.ElementoForm;
import s19_herenciaAndAbstract.mamiferos.canino.Canino;
import s19_herenciaAndAbstract.mamiferos.canino.Lobo;
import s19_herenciaAndAbstract.mamiferos.canino.Perro;
import s19_herenciaAndAbstract.mamiferos.felino.Felino;
import s19_herenciaAndAbstract.mamiferos.felino.Gepardo;
import s19_herenciaAndAbstract.mamiferos.felino.Leon;
import s19_herenciaAndAbstract.mamiferos.felino.Tigre;

import java.util.Arrays;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero l1 = new Leon(120, 5, 7.5f, "Sur Africa", 58, 120, 220, 190);
        Mamifero t1 = new Tigre("Siberiano", 7.9f, 72, "Rusia", 130, 330, 300);
        Mamifero l2 = new Lobo(9, "Ibérico", 2.5f, "Gris marrón y negro", "Europa", 80, 120, 70);
        Mamifero p1 = new Perro(317, 2.5f, "Tricolor de manchas negras, blancas y óxido", "Africa", 43, 92, 35);
        Mamifero t2 = new Tigre("Bengala", 7.9f, 72, "India e Indonesia", 110, 270, 220);
        Mamifero g1 = new Gepardo(4.9f, 130, "Africa", 94, 140, 72);

        List<Mamifero> animales = Arrays.asList(l1, t1, l2, p1, t2, g1);

        animales.forEach( animal ->{
            System.out.println(animal.getClass().getSimpleName());
            System.out.println("Habitat:" + animal.getHabitad());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanioColmillo());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanioGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecie());
                }
            }
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comer());
            System.out.println(animal.comunicarse());

            System.out.println();
        });
    }
}
