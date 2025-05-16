package s12_arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class c109_par_Impar {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa " + a.length + " elementos: ");
        for (int i = 0; i < a.length-1; i++) {
            a[i] = sc.nextInt();
        }

        int totalPar = 0;
        int totalImpar = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0) { totalPar++; } else { totalImpar++; }
        }

        int[] pares = new int[totalPar];
        int[] impares = new int[totalImpar];

        int j=0,k=0;

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                pares[j++] = a[i];
            } else {
                impares[k++] = a[i];
            }
        }

        System.out.println("Pares: "+ Arrays.toString(pares));
        System.out.println("Impares: "+ Arrays.toString(impares));
    }
}
