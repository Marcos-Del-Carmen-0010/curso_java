package s12_arreglos;

import java.util.Scanner;

public class c108_detectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 números: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < a.length-1; i++) {
            if(a[i] > a[i+1]) {
                descendente = true;
            }

            if(a[i] < a[i+1]) {
                ascendente = true;
            }
        }

        if(ascendente && descendente) {
            System.out.println("Estan desordeandos");
        }

        if (ascendente == false && descendente == false) {
            System.out.println("Todos son iguales");
        }

        if (ascendente == true && descendente == false) {
            System.out.println("Orden asendente");
        }

        if (ascendente == false && descendente == true) {
            System.out.println("Orden desendente");
        }
    }
}
