package s20_pooInterfaces.impresora;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    private String titulo;
    private String autor;
    private List<Hoja> paginas;
    private CatGenero genero;

    public Libro(String titulo, String autor, CatGenero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Hoja pagina) {
        this.paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo del libro: " + this.titulo)
                .append("\nAutor: " + this.autor)
                .append("\nGenero: " + this.genero)
                .append("\nCONTENIDO \n");
        for (Hoja hoja : this.paginas) {
            sb.append(hoja.imprimir() + "\n");
        }
        return sb.toString();
    }


}
