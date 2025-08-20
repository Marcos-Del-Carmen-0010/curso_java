package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.BaseEntity;
import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.catalogos.Direccion;

import java.util.ArrayList;
import java.util.List;

public abstract class AbtractaListCRUD<T extends BaseEntity> implements IHome<T> {

    public List<T> listaClientes;

    public AbtractaListCRUD() {
        this.listaClientes = new ArrayList<T>();
    }

    @Override
    public List<T> listar() {
        return this.listaClientes;
    }


    @Override
    public T buscar(int id) {
        T entidad = null;
        for (T ent : this.listaClientes) {
            if(ent.getId() != null && ent.getId() == id) {
                entidad = ent;
                break;
            }
        }
        return entidad;
    }

    @Override
    public void crear(T t) {
        this.listaClientes.add(t);
    }

    @Override
    public void eliminar(int id) {
        T cli = this.buscar(id);
        this.listaClientes.remove(cli);
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.listaClientes.subList(desde, hasta);
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

    @Override
    public int getTotal(){
        return this.listaClientes.size();
    }
}
