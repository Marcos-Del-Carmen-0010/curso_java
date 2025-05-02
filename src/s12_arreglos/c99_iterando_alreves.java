package s12_arreglos;

import java.util.Arrays;

public class c99_iterando_alreves {
    public static void main(String[] args) {
        String[] namesProducts = {"Kingston Pendrive 64GB", "Samsung Galaxy 64GB", "Disco Duro SSD 64GB", "Asus Notebook", "Macbook Air", "Chtomecast 4ta Generation", "Bicicleta Oxford"};

        // String[] product = new String[namesProducts.length];
        for (int i = namesProducts.length-1; i >= 0 ; i--) {
            // product[i] = namesProducts[i];
            System.out.println("Producto " + i + " : " + namesProducts[i]);
        }
        // System.out.println("ARRAY AL REVES: " + Arrays.toString(product));
    }
}
