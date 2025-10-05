package s26_ExprecionesLambda.ejercicios;

import java.util.HashMap;
import java.util.Map;

public class e30_PalabrasMasRepetida {
    public static void main(String[] args) {
        String texto = "Mi Laptop es una buena Laptop ya que mi Laptop costo $14US, Laptop";

        String[] palabras = texto.split("\\s+");
        Map<String, Integer> contador = new HashMap<>();
        String palabraMasRepetida = null;
        int maxRepeticiones = 0;

        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }
        System.out.println("Objeto de palabras: " + contador);
        for (Map.Entry<String, Integer> entrada : contador.entrySet()) {
            if (entrada.getValue() > maxRepeticiones) {
                palabraMasRepetida = entrada.getKey();
                maxRepeticiones = entrada.getValue();
            }
        }

        System.out.println("La palabra más repetida es: " + palabraMasRepetida + " (" + maxRepeticiones + " veces)");
    }
}
