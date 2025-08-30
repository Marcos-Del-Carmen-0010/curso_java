package s24_EstructuraDeDatos;

import s24_EstructuraDeDatos.modelos.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class c235_EjemHashSet {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Marcos", 7));
        sa.add(new Alumno("Pedro", 8));
        sa.add(new Alumno("Juan", 9));
        sa.add(new Alumno("Hortencia", 10));
        sa.add(new Alumno("Mauricio", 8));
        sa.add(new Alumno("Zeus", 10));
        sa.add(new Alumno("Zeus", 9));

        System.out.println("Lista ordenada con hashset: " + sa);

        System.out.println("USANDO FOREACH");
        for (Alumno a : sa) {
            System.out.println(a);
        }

        System.out.println("USANDO ITERATOR CON WHILE");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            System.out.println(a);
        }

        System.out.println("USANDO FOREACH CON EXPRECIÓN LAMDA");
        sa.forEach(System.out::println);

    }
}
