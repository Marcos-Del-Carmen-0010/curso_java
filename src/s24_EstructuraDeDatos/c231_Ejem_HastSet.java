package s24_EstructuraDeDatos;

import java.util.HashSet;
import java.util.Set;

public class c231_Ejem_HastSet {
    public static void main(String[] args) {
        Set<String> hastSet = new HashSet<>();
        hastSet.add("uno");
        hastSet.add("dos");
        hastSet.add("tres");
        hastSet.add("cuatro");
        hastSet.add("cinco");
        hastSet.add("arbol");

        System.out.println(hastSet);
    }
}
