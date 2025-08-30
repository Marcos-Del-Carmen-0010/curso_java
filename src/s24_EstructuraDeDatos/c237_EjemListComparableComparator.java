package s24_EstructuraDeDatos;

import s24_EstructuraDeDatos.modelos.Alumno;

import java.util.*;

public class c237_EjemListComparableComparator {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Marcos", 7));
        sa.add(new Alumno("Pedro", 8));
        sa.add(new Alumno("Juan", 9));
        sa.add(new Alumno("Hortencia", 10));
        sa.add(new Alumno("Mauricio", 8));
        sa.add(new Alumno("Zeus", 10));
        sa.add(new Alumno("Zeus", 9));

        Collections.sort(sa, (a, b)->a.getNombre().compareTo(b.getNombre()));
        sa.sort((a, b)->a.getNombre().compareTo(b.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNombre));

        System.out.println("Lista ordenada con hashset: " + sa);

    }
}
