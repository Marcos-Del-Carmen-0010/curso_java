package s13_matrizes.tareas;

public class t18_MatrizX {
    public static void main(String[] args) {
        int n = 7;
        int[][] matrizX = new int[n][n];

        for (int i = 0; i < matrizX.length; i++) {
            int k = n-1;
            for (int j = 0; j < matrizX.length; j++) {
                if (i == j || i == k) {
                    matrizX[i][j] = 1;
                    matrizX[i][k] = 1;
                }
                System.out.print(matrizX[i][j]+"\t");
                k--;
            }

            System.out.println();
        }
    }
}
