package s20_pooInterfaces.catalogo;

/**
 * La clase Comics con en el extends de Libro e implementar el método
 * de la interface getPrecioVenta() y su atributo personaje (string)
 * con su respectivo método getter y constructor.
 * */
public class Comics extends Libro {
    private String personaje;
    public Comics(int precio, String titulo, String autor, String editorial, String personaje) {
        super(precio, titulo, autor, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return this.personaje;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 0.85;
    }
}
