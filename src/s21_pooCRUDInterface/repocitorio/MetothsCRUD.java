package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.Cliente;

import java.util.List;

public interface MetothsCRUD {
    List<Cliente> listar();
    Cliente buscar(int id);
    void crear(Cliente cliente);
    void editar(Cliente cliente);
    void eliminar(int id);

}
