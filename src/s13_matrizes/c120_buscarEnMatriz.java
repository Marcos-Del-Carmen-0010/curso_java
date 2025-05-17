package s13_matrizes;

public class c120_buscarEnMatriz {
    public static void main(String[] args) {
        int i;
        int j=0;
        boolean resultado = false;
        int numBuscar = 35;
        int[][] numeros = {
                {121, 312, 212, 32},
                {42, 129, 652, 23},
                {134, 35, 12, 651}
        };

        buscar: for (i = 0; i < numeros.length; i++) {
            System.out.println("entra");
            for (j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == numBuscar) {
                    resultado = true;
                    break buscar;
                }
            }
        }
        System.out.println("Numero a buscar: " + numBuscar);

        if (resultado) {
            System.out.println("Numero encontrado en la coordenada:" + i + ", " +j);
        } else {
            System.out.println("No fue encontrado el numero");
        }
    }
}
