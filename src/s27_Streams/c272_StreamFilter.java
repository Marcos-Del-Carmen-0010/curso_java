package s27_Streams;

import s27_Streams.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class c272_StreamFilter {
    public static void main(String[] args) {
        String[] names = {"Marcos Sánchez", "Jorge Perez", "Ivan Patricio", "Roberto Gomez", "Ivan Ramirez"};

        Usuario usuario = Stream
                .of(names)
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId() == 1)
                .findFirst().get();

        System.out.println(usuario);
    }
}
