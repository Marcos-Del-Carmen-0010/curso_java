package s21_pooCRUDInterface.repocitorio;
import java.util.List;

public interface MetothsCRUD<T> {
    List<T> listar();
    T buscar(int id);
    void crear(T t);
    void editar(T t);
    void eliminar(int id);
}
