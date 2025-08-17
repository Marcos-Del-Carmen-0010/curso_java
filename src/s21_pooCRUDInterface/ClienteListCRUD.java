package s21_pooCRUDInterface;

import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.catalogos.Direccion;
import s21_pooCRUDInterface.repocitorio.IHome;

import java.util.ArrayList;
import java.util.List;

public class ClienteListCRUD implements IHome {

    public List<Cliente> listaClientes;

    public ClienteListCRUD() {
        this.listaClientes = new ArrayList<Cliente>();
    }

    @Override
    public List<Cliente> listar() {
        return this.listaClientes;
    }

    @Override
    public Cliente buscar(int id) {
        Cliente cliente = null;
        for (Cliente c : this.listaClientes) {
            if(c.getId() != null && c.getId() == id) {
                cliente = c;
                break;
            }
        }
        return cliente;
    }

    @Override
    public void crear(Cliente cliente) {
        this.listaClientes.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.buscar(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(int id) {
        Cliente cli = this.buscar(id);
        this.listaClientes.remove(cli);
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.listaClientes);
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

    @Override
    public List<Cliente> listar(int desde, int hasta) {
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
