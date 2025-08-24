package s12_arreglos_tarea;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class c117_numeroMayor {
    public static void main(String[] args) {
        // tiempo en resolver 4:07

        int[] nums = new int[10];
        int numMayor = 0;
        int total = nums.length;
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese " + total + " elementos");
        for (int i = 0; i < 10; i++) {
            System.out.print("> ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < total; i++) {
            if (nums[i] > numMayor) { // aca es donde comparamos con el mayor que se guarda más adelante :D
                numMayor = nums[i]; // guardamos el mayor y comparamos
            }
        }
        System.out.println("Arreglo: " + Arrays.toString(nums));
        System.out.println("Numero mayor: " + numMayor);
    }
}
