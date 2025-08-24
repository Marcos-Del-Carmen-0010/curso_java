package s12_arreglos_tarea;

import java.util.Arrays;

public class t17_historial {
    public static void main(String[] args) {
        int[] nums = {3,4,5,4,6,6,4,6,1, 4, 6,5,1};
        String[] arregloHistograma = new String[6];

        for (int i = 0; i < arregloHistograma.length; i++) {
            int aux = i + 1;
            String historial = aux + ":";
            for (int j = 0; j < nums.length; j++) {
                if (aux == nums[j]) {
                    historial += "*";
                }
            }
            arregloHistograma[i] = historial;
        }

        for (int i = 0; i < arregloHistograma.length; i++) {
            System.out.println(arregloHistograma[i]);
        }

    }
}
