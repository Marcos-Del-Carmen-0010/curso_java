package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.BaseEntity;
import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.excepciones.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AbtractaListCRUD<T extends BaseEntity> implements IHome<T> {

    public List<T> listaEntidades;

    public AbtractaListCRUD() {
        this.listaEntidades = new ArrayList<T>();
    }

    @Override
    public List<T> listar() {
        return this.listaEntidades;
    }


    @Override
    public T buscar(int id) throws LecturaAccesoDatoException {
        if (id <= 0) {
            throw new LecturaAccesoDatoException("Id invalido tiene que ser mayor a 0");
        }
        T entidad = null;
        for (T ent : this.listaEntidades) {
            if(ent.getId() != null && ent.getId() == id) {
                entidad = ent;
                break;
            }
        }
        return entidad;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException, RegistroDuplicadoAccesoException {
        if (t == null) {
            throw new EscrituraAccesoDatoException("No puedes crear un objeto nulo");
        }
        if (this.listaEntidades.contains(t)) {
            throw new RegistroDuplicadoAccesoException("Excepción el objeto con id " + t.getId() + " ya existe");
        }
        this.listaEntidades.add(t);
    }

    @Override
    public void eliminar(int id) throws LecturaAccesoDatoException {
        T cli = this.buscar(id);
        this.listaEntidades.remove(cli);
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.listaEntidades.subList(desde, hasta);
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
        return this.listaEntidades.size();
    }
}
