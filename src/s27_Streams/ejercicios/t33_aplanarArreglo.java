package s27_Streams.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.String.valueOf;

public class t33_aplanarArreglo {
    public static void main(String[] args) {

        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"javascript"},
                {"python"},
                {"java", "javascript", "kotlin"},
        };
        Stream.of(lenguajes)
                .flatMap(lenjuage -> Arrays.stream(lenjuage))
                .distinct()
                .forEach(System.out::println);
        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));
    }
}
