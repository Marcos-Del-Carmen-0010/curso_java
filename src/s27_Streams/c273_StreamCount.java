package s27_Streams;

import s27_Streams.models.Usuario;

import java.util.stream.Stream;

public class c273_StreamCount {
    public static void main(String[] args) {
        String[] names = {"Marcos Sánchez", "Jorge Perez", "Ivan Patricio", "Roberto Gomez", "Ivan Ramirez"};
        
        long usuario = Stream.of(names).count();

        System.out.println("¿Cuantos elementos son? : " + usuario);
    }
}
