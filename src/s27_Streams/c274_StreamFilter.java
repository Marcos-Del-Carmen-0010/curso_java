package s27_Streams;

import s27_Streams.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class c274_StreamFilter {
    public static void main(String[] args) {
        Stream<Usuario> personas = Stream
                .of("Marcos Sánchez", "Jorge Perez", "Ivan Patricio", "Roberto Gomez", "Ivan Ramirez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId() == 1)
                .peek(System.out::println);

        Optional<Usuario> usuario2 = personas.findFirst();
        if (usuario2.isPresent()) {
            System.out.println("Usuario: " + usuario2.get());
        } else {
            System.out.println("El usuario no existe");
        }

    }
}
