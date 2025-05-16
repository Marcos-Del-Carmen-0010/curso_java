package s12_arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class c112_moverUnaPost {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa " + num.length + " elementos:");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int ultimo = num[num.length - 1];
        for (int i = num.length-2; i >= 0; i--) {
            num[i+1] = num[i];
        }

        num[0] = ultimo;

        System.out.println("Ultimo en el primero: "+Arrays.toString(num));
    }
}
