package s21_pooCRUDInterface.repocitorio;
import java.util.List;

public interface MetothsCRUD<T> {
    List<T> listar();
    T buscar(int id);
    void crear(T cliente);
    void editar(T cliente);
    void eliminar(int id);

}
