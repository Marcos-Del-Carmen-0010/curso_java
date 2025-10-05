package s26_ExprecionesLambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class c266_fuction {
    public static void main(String[] args) {

        Function<String, String> fun = s -> "Hola que tal " + s + "!";
        System.out.println(fun.apply("Marcos"));

        Function<String, String> fun2 = s -> s.toUpperCase();
        System.out.println(fun2.apply("Marcos"));

        BiFunction<String, String, String> fun3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println("fun3: " + fun3.apply("Marcos", " Del Carmen"));


        BiFunction<String, String, Integer> fun4 = (a, b) -> a.compareTo(b);
        System.out.println("fun4: " + fun4.apply("Marcos", "Marcos"));
    }
}
