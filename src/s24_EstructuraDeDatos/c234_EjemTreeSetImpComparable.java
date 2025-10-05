package s24_EstructuraDeDatos;

import s24_EstructuraDeDatos.modelos.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class c234_EjemTreeSetImpComparable {
    public static void main(String[] args) {
        // Set<Alumno> sa = new TreeSet<Alumno>((a, b) -> b.getNombre().compareTo(a.getNombre()));
        Set<Alumno> sa = new TreeSet<Alumno>((a, b) -> b.getNombre().compareTo(a.getNombre()));
        sa.add(new Alumno("Marcos", 7));
        sa.add(new Alumno("Pedro", 8));
        sa.add(new Alumno("Juan", 9));
        sa.add(new Alumno("Hortencia", 10));
        sa.add(new Alumno("Mauricio", 8));
        sa.add(new Alumno("Zeus", 10));

        System.out.println("Lista ordenada con treeset: " + sa);
    }
}
