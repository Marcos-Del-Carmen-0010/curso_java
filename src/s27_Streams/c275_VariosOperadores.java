package s27_Streams;

import java.util.stream.Stream;

public class c275_VariosOperadores {
    public static void main(String[] args) {
        long listaNombres = Stream.of("John","", "Doe", "Jane", "Mike", "Mich", "Rick", "", "")
                .filter(s -> s.isEmpty()).count();
        System.out.println("Casillas en blanco: " + listaNombres);

        Stream<String> listaNombreAlumnos = Stream.of("Marcos","Marcos","Diana","Martin","Roman","Marcos","Jorge","Marcos");
        listaNombreAlumnos.distinct().forEach(a->System.out.println("Alumno: " + a));

        Stream<String> listaNombreAlumnos1A = Stream.of("Marcos","Diana","Martin","Roman","Jorge");
        String cadenaDeAlumnos = listaNombreAlumnos1A.reduce("Lista de alumnos: ", (a, b)-> a + " "+ b);
        System.out.println(cadenaDeAlumnos);

        Stream<Integer> listaNumeros = Stream.of(10,9,8,7,6,5,4,3,2,1);
        System.out.println("Suma del 1 al 10: "+ listaNumeros.reduce(0, (a,b)-> a + b));

    }
}
