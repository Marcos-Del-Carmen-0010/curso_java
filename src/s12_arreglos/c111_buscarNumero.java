package s12_arreglos;

import java.util.Scanner;

public class c111_buscarNumero {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa " + numeros.length + " números");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("¿Que numero quieres buscar?");
        int num = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                encontrado = true;
                System.out.println("El numero esta en la posición " + i + " es: " + num);
                return;
            }
        }

        if (!encontrado) {
            System.out.println("No se logro encontrar el numero...");
        }
    }
}
