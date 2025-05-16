package s13_matrizes;

public class c118_MatrizBasica {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 1, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
