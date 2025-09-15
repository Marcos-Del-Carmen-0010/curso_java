package s27_Streams;

import s27_Streams.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class c271_StreamMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream
                .of("Marcos Sánchez", "Jorge Perez", "Ivan Patricio", "Roberto Gomez")
                .map(usuario -> new Usuario(usuario.split(" ")[0], usuario.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        List<Usuario> usuarios = nombres.collect(Collectors.toList());
        usuarios.forEach(System.out::println);
    }
}
