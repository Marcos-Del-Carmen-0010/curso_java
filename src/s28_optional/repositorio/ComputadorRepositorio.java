package s28_optional.repositorio;

import s28_optional.interfaces.Repositorio;
import s28_optional.models.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> computadores;

    public ComputadorRepositorio() {
        this.computadores = new ArrayList<>();
        this.computadores.add(new Computador("Asus", "Strix G512"));
        this.computadores.add(new Computador("MacBook Pro", "MVCK21"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return this.computadores.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
    }
}
