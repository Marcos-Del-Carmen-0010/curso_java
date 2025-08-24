package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.BaseEntity;
import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.catalogos.Direccion;
import s21_pooCRUDInterface.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListCRUD<T extends BaseEntity> extends AbtractaListCRUD<Cliente> {

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente cli = this.buscar(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.listaEntidades);
        listaOrdenada.sort((o1, o2) ->  {
            int resultado = 0;

            if(dir == Direccion.ASC) {
                resultado = ordenar(campo, o1, o2);
            } else if(dir == Direccion.DESC) {
                resultado = ordenar(campo, o2, o1);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}
