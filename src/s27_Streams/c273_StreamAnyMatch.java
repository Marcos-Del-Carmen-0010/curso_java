package s27_Streams;

import s27_Streams.models.Usuario;

import java.util.stream.Stream;

public class c273_StreamAnyMatch {
    public static void main(String[] args) {
        String[] names = {"Marcos Sánchez", "Jorge Perez", "Ivan Patricio", "Roberto Gomez", "Ivan Ramirez"};
        
        boolean usuario = Stream
                .of(names)
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .anyMatch(u -> u.getId() == 2);

        System.out.println("Exite el usuario con id 2 : " + usuario);
        if (usuario) {

        }
    }
}
