package s13_matrizes;

import java.util.Arrays;

public class c121_SimetricaMatriz {
    public static void main(String[] args) {
        /**
         * Lo que se quiere llegar en esta es comparar las columnas es decir
         * si la columna es igual a su fila algo como columna 0 eres igual a
         * la columna 0 y asi susecivamente.
         * */
        int[][] matriz1 = {
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {3, 4, 5, 6},
                {4, 5, 6, 7}
        };
        boolean simetrica = true;
        salir: for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz1[j][i]) {
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica) {
            System.out.println("El matriz es simetrica ");
        } else {
            System.out.println("El matriz no es simetrica ");
        }
    }
}
