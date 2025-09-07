package s25_HilosConcurrencia;

import java.util.concurrent.*;

public class e28_HiloNumerico {
    public static void main(String[] args) {
        String[] letras  = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        ExecutorService executor = Executors.newFixedThreadPool(1);

        System.out.println("Iniciando thread de numeros");
        Runnable hiloNumeros = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Número: " + i);
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable hiloLetras = ()-> {
            try {
                for (int i = 0; i < letras.length; i++) {
                    System.out.println("Letra: " + letras[i]);
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        executor.execute(hiloNumeros);
        executor.execute(hiloLetras);
        executor.shutdown();
    }
}
