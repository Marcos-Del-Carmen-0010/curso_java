package s27_Streams;

import s27_Streams.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class c278_ListToStream {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Marcos", "Del Carmen"));
        usuarios.add(new Usuario("Vianney", "Martinez"));
        usuarios.add(new Usuario("David", "Hernandez"));
        usuarios.add(new Usuario("Jenifer", "Lopez"));
        usuarios.add(new Usuario("Javier", "Rosales"));
        usuarios.add(new Usuario("Javier", "Lopez"));
        usuarios.add(new Usuario("Damian", "Rodigrez"));

        Stream nombres = usuarios.stream()
                .map(u-> u.getNombre().toUpperCase().concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                .flatMap(nombre->{
                    if(nombre.contains("javier".toUpperCase())){
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);


        System.out.println("Encontramos: " + nombres.count());
    }
}
