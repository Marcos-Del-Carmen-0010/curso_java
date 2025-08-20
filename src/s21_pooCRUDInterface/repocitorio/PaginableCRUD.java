package s21_pooCRUDInterface.repocitorio;

import java.util.List;

public interface PaginableCRUD<T> {
    List<T> listar(int desde, int hasta);
}
