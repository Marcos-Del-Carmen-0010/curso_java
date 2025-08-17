package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.Cliente;
import java.util.List;

public interface PaginableCRUD {
    List<Cliente> listar(int desde, int hasta);
}
