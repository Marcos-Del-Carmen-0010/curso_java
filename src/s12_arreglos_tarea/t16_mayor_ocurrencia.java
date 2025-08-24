package s12_arreglos_tarea;
import java.util.Arrays;

public class t16_mayor_ocurrencia {
    public static void main(String[] args) {
        int[] nums = {3,4,5,4,4,4,6,6,7,8,6,1,4,9};
        int ocurrencia = 0;
        int elementoRepetido = 0;
        int cont;
        for (int i = 0; i < nums.length; i++) {
            cont = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cont++;
                    ocurrencia = cont >= ocurrencia ? cont : ocurrencia;
                    if (cont >= ocurrencia) {
                        elementoRepetido = nums[i];
                    }
                }
            }
        }
        System.out.println("El arreglo tiene " + Arrays.toString(nums));
        System.out.println("La ocurrencia ocurrencia es " + elementoRepetido);
        System.out.println("El elemento se repite hasta " + ocurrencia + " veces");
    }
}
