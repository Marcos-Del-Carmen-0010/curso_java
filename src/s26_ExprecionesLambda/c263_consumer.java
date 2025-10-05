package s26_ExprecionesLambda;

import s26_ExprecionesLambda.models.Persona;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class c263_consumer {
    public static void main(String[] args) {
        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(f.format(fecha));
        };

        consumidor.accept(new Date());

        BiConsumer<String, Integer> persona = (nombre, edad) -> System.out.println(nombre + " tiene " + edad + " años!");
        persona.accept("Pablo", 20);

        List<Integer> edades = List.of(15, 22, 17, 30);
        Consumer<Integer> procesarEdad = edad -> {
            if (edad >= 18) {
                System.out.println("Mayor de edad: " + edad);
            } else {
                System.out.println("Menor de edad: " + edad);
            }
        };
        edades.forEach(procesarEdad);

        List<String> nombres = List.of("Hortencia", "Sergio", "Matias");
        Consumer<String> consumerNombres = (nombre) -> {
            System.out.println("Nombre: " + nombre);
        };
        nombres.forEach(consumerNombres);

        Supplier<Persona> crearUsuario = Persona::new;
        Persona usuario = crearUsuario.get();

        BiConsumer<Persona, String> asignarNombre = Persona::setNombre;
        asignarNombre.accept(usuario, "Marcos");
        System.out.println("Nombre del usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo lambda supplier";
        System.out.println(proveedor.get());

    }
}
