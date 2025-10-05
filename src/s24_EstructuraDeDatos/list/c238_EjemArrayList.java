package s24_EstructuraDeDatos.list;

import s24_EstructuraDeDatos.modelos.Alumno;

import java.util.ArrayList;
import java.util.List;

public class c238_EjemArrayList {
    public static void main(String[] args) {
        List<Alumno> la = new ArrayList<>();
        la.add(new Alumno("Marcos", 7));
        la.add(new Alumno("Pedro", 8));
        la.add(new Alumno("Juan", 9));
        la.add(new Alumno("Hortencia", 10));
        la.add(new Alumno("Mauricio", 8));

        System.out.println(la + ", size = " + la.size());
        la.set(0, new Alumno("Emilio", 9));
        la.remove(1);
        System.out.println(la + ", size = " + la.size());

        boolean buscar = la.contains(new Alumno("Pedro", 8));
        System.out.println("¿La lista contiene a Pedro?: " + (buscar ? "si":"no"));
    }
}
