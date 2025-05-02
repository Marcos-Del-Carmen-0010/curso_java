package s12_arreglos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class c100_modificarArrayReverso {
    public static void main(String[] args) {
        String[] namesProducts = {"Kingston Pendrive 64GB", "Samsung Galaxy 64GB", "Disco Duro SSD 64GB", "Asus Notebook", "Macbook Air", "Chtomecast 4ta Generation", "Bicicleta Oxford"};
        int lengthProducts = namesProducts.length;

        for (int i = lengthProducts-1; i >= 0 ; i--) {
            System.out.println("Producto " + i + " : " + namesProducts[i]);
        }
        System.out.println("--------------------------------------------------");
        int total = namesProducts.length;
        for (int i = 0; i < total; i++) {
            String actual = namesProducts[i];
            String inverso = namesProducts[total-1-i];

            namesProducts[i] = inverso;
            namesProducts[total-1-i] = actual;

            total--;
        }
        System.out.println(Arrays.toString(namesProducts));
        System.out.println("--------------------------------------------------");
        Collections.reverse(Arrays.asList(namesProducts));
        for (int i = 0; i < lengthProducts; i++) {
            System.out.println("Producto " + i + " : " + namesProducts[i]);
        }
    }
}
