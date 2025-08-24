package s20_pooInterfaces.catalogo;

import java.util.Arrays;
import java.util.List;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        IPhone pro1 = new IPhone(299000, "Apple", "3G", "Negro");
        IPhone pro2 = new IPhone(399000, "Apple", "4G", "Blanco");
        TvLcd pro3 = new TvLcd(340000, "Sony", 40);
        Libro pro4 = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
        Libro pro5  = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
        Comics pro6 = new Comics(5000, "Pepo", "Condorito", "Alguna...", "Condorito");

        List<IProducto> productos = Arrays.asList(pro1, pro2, pro3, pro4, pro5, pro6);
        for (IProducto producto : productos) {
            System.out.println("Tipo: "+ producto.getClass().getName());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Precio venta: " + producto.getPrecioVenta());

            if (producto instanceof IElectronico) {
                System.out.println("Fabricante: " + ((IElectronico) producto).getFabricante());

                if(producto instanceof IPhone) {
                    System.out.println("Modelo: " + ((IPhone) producto).getModelo());
                    System.out.println("Color: " + ((IPhone) producto).getColor());
                }

                if (producto instanceof TvLcd) {
                    System.out.println("Pulgada: " + ((TvLcd) producto).getPulgada());
                }
            }

            if(producto instanceof ILibro) {
                System.out.println("Fecha publicacion: " + ((ILibro) producto).getFechaPublicacion());
                System.out.println("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.println("Autor: " + ((ILibro) producto).getAutor());
                System.out.println("Editorial: " + ((ILibro) producto).getEditorial());

                if(producto instanceof Comics) {
                    System.out.println("Personajes: " + ((Comics) producto).getPersonaje());

                }
            }
            System.out.println("----------------------");
        }
    }
}
