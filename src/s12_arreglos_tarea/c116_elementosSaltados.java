package s12_arreglos_tarea;

import java.util.Arrays;
import java.util.Scanner;

public class c116_elementosSaltados {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int total = nums.length;
        int i , j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa " + total + " elementos");

        for (int k = 0; k < total; k++) {
            System.out.print("> ");
            nums[k] = sc.nextInt();
        }
        System.out.println("Orden inicial: " + Arrays.toString(nums));
        j = total;
        for (i = 0; i < 5; i++) {
            j--;
            System.out.println("Fila: " + nums[i] + ", " + nums[j]);
        }

        // 1,2,3,4,5,6,7,8,9,10
        // 1,10, 2,9, 3,8, 4,7, 5,6
    }
}
