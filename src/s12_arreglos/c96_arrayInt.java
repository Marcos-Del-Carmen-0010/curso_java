package s12_arreglos;

import java.util.Arrays;

public class c96_arrayInt {
    public static void main(String[] args) {
        int[] arreglo = new int[5];
        
        for (int i = 1; i <= arreglo.length; i++) {
            System.out.println("i:" + i);
            arreglo[i-1] = i;
        }

        String[] namesProducts = {"Kingston Pendrive 64GB", "Samsung Galaxy 64GB", "Disco Duro SSD 64GB", "Asus Notebook", "Macbook Air", "Chtomecast 4ta Generation", "Bicicleta Oxford"};
        Arrays.sort(namesProducts);
        System.out.println("names products: " + Arrays.toString(namesProducts));

        String[] product = new String[namesProducts.length];
        for (int i = 0; i < product.length; i++) {
            product[i] = namesProducts[i];
        }

        System.out.println("prodcuts: "+Arrays.toString(product));
    }
}
