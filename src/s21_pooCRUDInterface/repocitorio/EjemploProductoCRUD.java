package s21_pooCRUDInterface.repocitorio;

import s21_pooCRUDInterface.Modelo.Producto;
import s21_pooCRUDInterface.Modelo.Producto;
import s21_pooCRUDInterface.catalogos.Direccion;

import java.util.List;

public class EjemploProductoCRUD {
    public static void main(String[] args) {
        IHome<Producto> repo = new ProductoListCRUD<>();

        repo.crear(new Producto("Escritorio negro",1500.1)); // [0]
        repo.crear(new Producto("Silla ",1200.90));       // [1]
        repo.crear(new Producto("Monitor",1000.10));       // [2]
        repo.crear(new Producto("Ventilador",1100));     // [3]

        System.out.println("===== LISTA DE PRODUCTOS =====");
        List<Producto> productos = repo.listar();
        for (Producto pro : productos) {
           System.out.println(pro.toString());
        }

        System.out.println("===== PAGINAR LISTA DE PRODUCTOS =====");
        List<Producto> pagProductos = repo.listar(0,4);
        for (Producto pro : pagProductos) {
            System.out.println(pro.toString());
        }

        System.out.println("===== ORDENAMIENTO DE PRODUCTO =====");
        List<Producto> ordProducto = repo.listar("nombre", Direccion.DESC);
        for (Producto pro : ordProducto) {
            System.out.println(pro.toString());
        }

        System.out.println("===== EDITAR A UN CLIENTE =====");
        Producto editProducto = new Producto("Silla requinable",1300.20);
        editProducto.setId(2);
        repo.editar(editProducto);

        repo.buscar(editProducto.getId());
        System.out.println(editProducto);

        System.out.println("===== ELIMINAR A UN CLIENTE =====");
        repo.eliminar(4);
        for (Producto pro : productos) {
            System.out.println(pro.toString());
        }

        System.out.println("===== TOTAL =====");
        System.out.println("Registros: " + repo.getTotal());
    }
}
