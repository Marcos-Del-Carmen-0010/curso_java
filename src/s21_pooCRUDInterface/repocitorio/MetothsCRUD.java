package s21_pooCRUDInterface.repocitorio;
import s21_pooCRUDInterface.excepciones.AccesoDatoException;
import s21_pooCRUDInterface.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface MetothsCRUD<T> {
    List<T> listar();
    T buscar(int id) throws AccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(int id) throws AccesoDatoException;
}
