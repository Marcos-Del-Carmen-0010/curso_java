package s27_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class c269_StreamForeach {
    public static void main(String[] args) {
        System.out.println("USANDO SREAM.OF");
        Stream<String> nombresAlumnos = Stream.of("Marcos", "Daniel", "Annais", "Madisón");
        nombresAlumnos.forEach(System.out::println);
        System.out.println("USANDO ARRAY");
        String[] nombresProfes = {"Hernezto", "Juan", "Tiofilo", "Jazmin"};
        Stream<String> nombresProfesStream = Arrays.stream(nombresProfes);
        nombresProfesStream.forEach(System.out::println);
        System.out.println("USANDO STRINGBUILDER");
        Stream<String> animales = Stream.<String>builder()
                .add("Jepardo")
                .add("Gato")
                .add("Perro")
                .add("Biuda negra")
                .build();

        animales.forEach(System.out::println);


        List<String> muebles = new ArrayList<>();
        muebles.add("Silla");
        muebles.add("Mesa de centro");
        muebles.add("Comedor");
        muebles.add("Litera");

        Stream<String> mueblesStream = muebles.stream();
        mueblesStream.forEach(System.out::println);
        // muebles.stream().forEach(System.out::println);
    }
}
