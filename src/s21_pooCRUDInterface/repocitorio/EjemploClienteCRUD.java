package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.Cliente;
import s21_pooCRUDInterface.catalogos.Direccion;
import s21_pooCRUDInterface.excepciones.AccesoDatoException;
import s21_pooCRUDInterface.excepciones.EscrituraAccesoDatoException;
import s21_pooCRUDInterface.excepciones.LecturaAccesoDatoException;
import s21_pooCRUDInterface.excepciones.RegistroDuplicadoAccesoException;

import java.util.List;

public class EjemploClienteCRUD {
    public static void main(String[] args) {
        try {
            IHome<Cliente> repo = new ClienteListCRUD();

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
        } catch (LecturaAccesoDatoException lad) {
            System.out.println("Lectura: "+ lad.getMessage());
            lad.printStackTrace();
        } catch (EscrituraAccesoDatoException ead) {
            System.out.println("Escritura: "+ ead.getMessage());
            ead.printStackTrace();
        } catch (RegistroDuplicadoAccesoException rda) {
            System.out.println("Registro duplicado: "+ rda.getMessage());
            rda.printStackTrace();
        } catch (AccesoDatoException ad) {
            System.out.println("Acceso: "+ ad.getMessage());
            ad.printStackTrace();
        }
    }
}
