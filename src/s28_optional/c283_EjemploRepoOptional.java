package s28_optional;

import s28_optional.interfaces.Repositorio;
import s28_optional.models.Computador;
import s28_optional.repositorio.ComputadorRepositorio;

public class c283_EjemploRepoOptional {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        repositorio.filtrar("Asus").ifPresentOrElse(System.out::println, () -> {
            System.out.println("Computador encontrado");
        });
    }
}
