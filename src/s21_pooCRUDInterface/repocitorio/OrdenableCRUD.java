package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.catalogos.Direccion;
import java.util.List;

public interface OrdenableCRUD<T> {
    List<T> listar(String campo, Direccion dir);
}
