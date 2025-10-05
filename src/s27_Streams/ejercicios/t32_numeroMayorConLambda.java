package s27_Streams.ejercicios;
import java.util.stream.Stream;
public class t32_numeroMayorConLambda {
    public static void main(String[] args) {

//        int[] numeros = {10,21,3,4,11,2,7,34,9};
//        int mayor = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] == numeros.length) {
//                break;
//            } else {
//                mayor = numeros[i] > numeros[i+1] ? numeros[i] : numeros[i+1];
//            }
//
//        }
//        System.out.println("el mayor es: " + mayor);

        int numbers = Stream.of(10,21,3,4,11,2,7,34,9)
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("El numero mayor es: " + numbers);

    }
}
