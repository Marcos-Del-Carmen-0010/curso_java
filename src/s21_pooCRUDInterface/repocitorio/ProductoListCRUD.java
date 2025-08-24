package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.BaseEntity;
import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.Modelo.Producto;
import s21_pooCRUDInterface.catalogos.Direccion;
import s21_pooCRUDInterface.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListCRUD<T extends BaseEntity> extends AbtractaListCRUD<Producto> {

    @Override
    public void editar(Producto cliente) throws LecturaAccesoDatoException {
        Producto cli = this.buscar(cliente.getId());
        cli.setDescripcion(cliente.getDescripcion());
        cli.setPrecio(cliente.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.listaEntidades);
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

    public static int ordenar(String campo, Producto a, Producto b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
}
