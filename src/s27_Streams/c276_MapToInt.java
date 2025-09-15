package s27_Streams;

import s27_Streams.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class c276_MapToInt {
    public static void main(String[] args) {
        IntStream largoNombres = Stream.of("Marcos Sánchez", "Jorge Perez", "Ivan Patricio", "Roberto Gomez", "Ivan Ramirez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split("")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("Total: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Promedio: " + stats.getAverage());
    }
}
