package s12_arreglos;

import java.util.Arrays;

public class c101_ordenamientoBurbuja {
    public static void main(String[] args) {
        String[] namesProducts = {"Kingston Pendrive 64GB", "Samsung Galaxy 64GB", "Disco Duro SSD 64GB", "Asus Notebook", "Macbook Air", "Chtomecast 4ta Generation", "Bicicleta Oxford"};
        int total = namesProducts.length;

        int cont = 0;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if(namesProducts[j].compareTo(namesProducts[i]) < 0) {
                    String temp = namesProducts[i];
                    namesProducts[i] = namesProducts[j];
                    namesProducts[j] = temp;
                }
                cont++;
            }
        }
        System.out.println("contador: " + cont);
        System.out.println("Arreglo ordenado: " + Arrays.toString(namesProducts));
    }
}
