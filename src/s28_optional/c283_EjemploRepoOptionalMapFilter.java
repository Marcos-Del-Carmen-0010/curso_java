package s28_optional;

import s28_optional.interfaces.Repositorio;
import s28_optional.models.Computador;
import s28_optional.models.Fabricante;
import s28_optional.models.Procesador;
import s28_optional.repositorio.ComputadorRepositorio;

import java.util.Optional;

public class c283_EjemploRepoOptionalMapFilter {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab -> "intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconosido");

        System.out.println(f);
    }
}
