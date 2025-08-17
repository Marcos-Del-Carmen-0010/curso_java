package s21_pooCRUDInterface;

import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.catalogos.Direccion;
import s21_pooCRUDInterface.repocitorio.IHome;
import s21_pooCRUDInterface.repocitorio.MetothsCRUD;
import s21_pooCRUDInterface.repocitorio.OrdenableCRUD;
import s21_pooCRUDInterface.repocitorio.PaginableCRUD;

import java.util.List;

public class EjemploCRUD {
    public static void main(String[] args) {
        IHome repo = new ClienteListCRUD();

        repo.crear(new Cliente("Marcos","Del Carmen")); // [0]
        repo.crear(new Cliente("Pedro","Ramos"));       // [1]
        repo.crear(new Cliente("Juan","Torres"));       // [2]
        repo.crear(new Cliente("Laura","Sánchez"));     // [3]

        System.out.println("===== LISTA DE CLIENTES =====");
        List<Cliente> clientes = repo.listar();
        for (Cliente cli : clientes) {
           System.out.println(cli.toString());
        }

        System.out.println("===== PAGINAR LISTA DE CLIENTES =====");
        List<Cliente> pagClientes = repo.listar(0,4);
        for (Cliente cli : pagClientes) {
            System.out.println(cli.toString());
        }

        System.out.println("===== ORDENAMIENTO DE CLIENTES =====");
        List<Cliente> ordCliente = repo.listar("nombre", Direccion.DESC);
        for (Cliente cli : ordCliente) {
            System.out.println(cli.toString());
        }

        System.out.println("===== EDITAR A UN CLIENTE =====");
        Cliente editCliente = new Cliente("Pedro","Luciano");
        editCliente.setId(2);
        repo.editar(editCliente);

        repo.buscar(editCliente.getId());
        System.out.println(editCliente);

        System.out.println("===== ELIMINAR A UN CLIENTE =====");
        repo.eliminar(4);
        for (Cliente cli : clientes) {
            System.out.println(cli.toString());
        }

        System.out.println("===== TOTAL =====");
        System.out.println("Registros: " + repo.getTotal());
    }
}
