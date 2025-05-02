package s12_arreglos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c97_iterarArray {
    public static void main(String[] args) {
        String[] namesProducts = {"Kingston Pendrive 64GB", "Samsung Galaxy 64GB", "Disco Duro SSD 64GB", "Asus Notebook", "Macbook Air", "Chtomecast 4ta Generation", "Bicicleta Oxford"};
        int lengthProducts = namesProducts.length;
        Arrays.sort(namesProducts);
        for (int i = 0; i < lengthProducts; i++) {
            System.out.println("Para el indice " + i + " : "+ namesProducts[i]);
        }

        System.out.println("---------------------------------------");
        System.out.println("FOREACH");
        System.out.println("---------------------------------------");
        for(String prod: namesProducts) {
            System.out.println("product: " + prod);
        }

        System.out.println("---------------------------------------");
        System.out.println("WHILE");
        System.out.println("---------------------------------------");
        int k = 0;
        while(k < lengthProducts) {
            System.out.println("Para el indice " + k + " : "+ namesProducts[k]);
            k++;
        }
        System.out.println("---------------------------------------");
        System.out.println("DO WHILE");
        System.out.println("---------------------------------------");
        int j = 0;
        do {
            System.out.println("Para el indice " + j + " : "+ namesProducts[j]);
            j++;
        } while(j < lengthProducts);

        System.out.println("---------------------------------------");
        System.out.println("TABLA DE MULTITPLICAR");
        System.out.println("---------------------------------------");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }
    }
}
