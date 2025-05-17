package s13_matrizes;

public class c123_MatrizTranspuesta {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println("Matriz original ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        int aux;
        System.out.println("Se armar");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aux = matriz[i][j]; // se asignan los valores de la columna
                matriz[i][j] = matriz[j][i]; // se asignan los valores de la fila
                matriz[j][i] = aux;
            }
            System.out.println("");
        }
        System.out.println("Se termino de armar");
        System.out.println("Matriz transpuesta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
