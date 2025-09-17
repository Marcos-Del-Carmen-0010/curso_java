package s28_optional;

import java.util.Optional;

public class c282_introOptional {
    public static void main(String[] args) {
        String nombre = "Marcos del Carmen";

        Optional<String> optNombre = Optional.of(nombre);
        optNombre.ifPresent(System.out::println);


        nombre = "";
        optNombre = Optional.ofNullable(nombre);
        optNombre.ifPresentOrElse(valor -> System.out.println("Hola " + valor), () -> System.out.println("No hay nombre..."));
    }
}
