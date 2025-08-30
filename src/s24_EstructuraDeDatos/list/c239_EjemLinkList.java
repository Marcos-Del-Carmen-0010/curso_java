package s24_EstructuraDeDatos.list;

import s24_EstructuraDeDatos.modelos.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class c239_EjemLinkList {
    public static void main(String[] args) {
        List<Alumno> la = new ArrayList<>();
        la.add(new Alumno("Marcos", 7));
        la.add(new Alumno("Pedro", 8));
        la.add(new Alumno("Juan", 9));
        la.add(new Alumno("Hortencia", 10));
        la.add(new Alumno("Mauricio", 8));

        System.out.println("Lista de Alumnos : " + la);
        System.out.println("------------");
        la.addFirst(new Alumno("Pablo", 9));
        la.addLast(new Alumno("Hernezto", 8));
        System.out.println("Lista de Alumnos : " + la);
        System.out.println("------------");

        la.set(0, new Alumno("Pablo Sánchez", 10));
        System.out.println("Lista de Alumnos : " + la);
        System.out.println("------------");

        System.out.println("OBTENEMOS A MARCOS:  "+ la.get(1));
        System.out.println("OBTENEMOS AL PRIMERO:  "+ la.getFirst());
        System.out.println("OBTENEMOS AL ULTIMO:  "+ la.getLast());

        la.removeFirst();
        System.out.println("QUITAMOS AL PRIMERO : " + la);
        System.out.println("------------");
        la.removeLast();
        System.out.println("QUITAMOS AL ULTIMO : " + la);
        System.out.println("------------");

        la.remove(1);
        System.out.println("QUITAMOS SEGUNDO: " + la);
        System.out.println("......:;:;:;:;:;: LISTA NEXT");
        ListIterator<Alumno> it = la.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("......:;:;:;:;:;: LISTA PREVIUS");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

    }
}
