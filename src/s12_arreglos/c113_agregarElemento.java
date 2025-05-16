package s12_arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class c113_agregarElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int total = nums.length-1;
        int post = 0, num = 0;

        System.out.println("Ingresa " + nums.length + " elementos...");
        for (int i = 0; i < total; i++) {
            System.out.print("Ingresa un numero:");
            nums[i] = sc.nextInt();
        }

        System.out.println("Arreglo: "  + Arrays.toString(nums));
        System.out.print("Agrega el elemento: ");
        num = sc.nextInt();

        System.out.print("Ingresa la posicio: ");
        post = sc.nextInt();

        for (int i = total-1; i >= post; i--) {
            nums[i+1] = nums[i];
        }
        nums[post] = num;
        System.out.println("Arreglo con el numero: "+Arrays.toString(nums));
    }
}
