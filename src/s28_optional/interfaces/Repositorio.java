package s28_optional.interfaces;
import java.util.Optional;

public interface Repositorio<T>{
    Optional<T> filtrar(String nombre);
}
