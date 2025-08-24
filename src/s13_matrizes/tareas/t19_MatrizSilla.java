package s13_matrizes.tareas;

public class t19_MatrizSilla {
    public static void main(String[] args) {
        int x = 8, y = 3;
        int[][] matriz = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j == 0 || i == (x/2) || (i >= (x/2) && j >= (y-1))) {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
