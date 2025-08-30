package s24_EstructuraDeDatos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class c232_EjemTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>((a,b)->a.compareTo(b));

        ts.add("uno");
        ts.add("seis");
        ts.add("dos");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("tres");

        System.out.println("Numeros en letras: " + ts);

        Set<Integer> numeros = new TreeSet<Integer>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(10);
        numeros.add(6);
        numeros.add(2);
        numeros.add(8);
        numeros.add(9);

        System.out.println("Numeros en digitos: " + numeros);
    }
}
