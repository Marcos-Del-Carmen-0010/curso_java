package s13_matrizes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c126_SumaColumna {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] sumaFila = new int[matriz.length];
        int[] sumaColumna = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");
                sumaColumna[j] = sumaColumna[j] + matriz[i][j];
                sumaFila[i] = sumaFila[i] + matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("Suma de filas: "+Arrays.toString(sumaFila));
        System.out.println("Suma de columnas: "+Arrays.toString(sumaColumna));
    }
}
