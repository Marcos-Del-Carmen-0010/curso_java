package s20_pooInterfaces.catalogo;

/**
 * La clase Libro que debe de extender de Producto e implementar
 * el método getPrecioVenta(), ademas debe tener 4 atributos fechaPublicacion (Date),
 * autor (string), titulo (string) y editorial (string) con sus respectivos
 * métodos getters y el constructor. Pero ademas debe implementar la interface ILibro.
 * */

import java.util.Date;

public class Libro extends Producto implements ILibro {
    public Date fechaPublicacion = new Date();
    public String titulo;
    public String autor;
    public String editorial;

    public Libro(int precio, String titulo, String autor, String editorial) {
        super(precio);
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 0.95;
    }
}
