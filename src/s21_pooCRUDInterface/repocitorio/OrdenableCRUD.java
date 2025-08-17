package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.catalogos.Direccion;

import java.util.List;

public interface OrdenableCRUD {
    List<Cliente> listar(String campo, Direccion dir);
}
