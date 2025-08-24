package s12_arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class c114_ordenarUnNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        int total = nums.length, num, post = 0;

        System.out.println("Ingresa " + total + " elementos para ordenar");
        for (int i = 0; i < total-1; i++) {
            System.out.print("> ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Arreglo normal: " + Arrays.toString(nums));

        System.out.println();

        System.out.print("Ingrese un numero a insertar \n> ");
        num = sc.nextInt();

        while(post < total-1 && num > nums[post]) {
            post++;
            // System.out.println(num +" eres mayor a " + nums[post] + " ::::.... " +(( num > nums[post]) ? "Si" : "No"));
        }

        for (int i = total-2; i >= post; i--) { // iteramos hasta la posicion donde ya no se cumple la conducion "num > nums[post]"
            nums[i+1] = nums[i];
            // System.out.println("condicionl: "+ (i) + ">" + (post) + "::::.... "+ ((i >= post) ? "Si" : "No"));
        }

        nums[post] = num; // se agrega el numero en la posicion encontrada
        System.out.println("Numero: " + num + "\nOrdenado hasta la posición: " + post);
        System.out.println("Arreglo ordenado: " + Arrays.toString(nums));
    }
}