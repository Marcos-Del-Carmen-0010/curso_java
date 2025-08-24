package s12_arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class c115_eleminarElemento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[7];
        int total = nums.length, num, post = 0;

        System.out.println("Ingresa " + total + " elementos");
        for (int i = 0; i < total; i++) {
            System.out.print("> ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Arreglo numeros: " + Arrays.toString(nums));
        System.out.print("ingresa la poscion a eliminar es de 0 a " +(total-1) + "\n> ");
        num = sc.nextInt();
        System.out.println("Eliminado el " + nums[num] + "...");

        for (int i = num; i < total-1; i++) {
            nums[i] = nums[i+1];
        }

        nums[total-1] = 0;
        System.out.println("Arreglo ordenado: " + Arrays.toString(nums));
    }
}
