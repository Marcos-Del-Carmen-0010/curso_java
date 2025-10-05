/**
 * Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int, utilizando el api stream
 * se pide eliminar los divisibles en 10, luego convertir los elementos restante del flujo en tipo double y
 * dividirlos en 2, para finalmente devolver la suma total de todos ellos usando el operador terminal reduce.
 * El resultado debería ser 2250.0
 * */
package s27_Streams.ejercicios;

import java.util.stream.IntStream;

public class t31_sumaNumeros {
    public static void main(String[] args) {
    // MI OPCIÓN (NO ES LO MÁS OPTIMO PERO ES MÁS MIO)
//        int[] numeros = IntStream.rangeClosed(1, 100).toArray();
//        double suma = 0;
//        for( int i = 0; i < numeros.length; i++ ) {
//            if (!(numeros[i] % 10 == 0)) {
//                System.out.println( numeros[i] );
//                suma += numeros[i];
//            }
//        }
//        System.out.println(suma/2);
        // OPCION DEL CURSO
        int[] numeros = IntStream.rangeClosed(1, 100).toArray();
        int suma = IntStream.of(numeros)
                .filter(num -> num % 10 != 0) // excluye múltiplos de 10
                .reduce(0, (a, b) -> a + b);
        double resultado = (double)suma / 2;
        System.out.println("La suma es: " + resultado);
    }
}
