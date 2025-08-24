package s13_matrizes;

public class c119_StringMatriz {
    public static void main(String[] args) {

        String[][] matriz = {
                {"PEPE", "PEPA"},
                {"JOSEFA", "PACO"},
                {"LUCAS","PANCHA"}
        };

        for (String[] row : matriz) {
            for (String col : row) {
                System.out.print(col +"\t");
            }
            System.out.println();
        }
    }
}
