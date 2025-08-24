package s13_matrizes;

public class c125_SumaMatrices {
    public static void main(String[] args) {
        int[][] a ={
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };

        int[][] b = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int[][] suma = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
