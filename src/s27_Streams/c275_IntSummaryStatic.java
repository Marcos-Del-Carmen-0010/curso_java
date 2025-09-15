package s27_Streams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class c275_IntSummaryStatic {
    public static void main(String[] args) {
        IntStream num = IntStream.range(1, 20).peek(System.out::print);

        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("Numero maximo: " + stats.getMax());
        System.out.println("Numero minimo: " + stats.getMin());
        System.out.println("Suma de numeros: " + stats.getSum());
        System.out.println("Promedio de numeros: " + stats.getAverage());
        System.out.println("Total: " + stats.getCount());
    }
}
