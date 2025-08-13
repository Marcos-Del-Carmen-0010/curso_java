package s20_pooInterfaces.catalogo;

import java.util.Date;

public interface ILibro {
    Date getFechaPublicacion();
    String getTitulo();
    String getAutor();
    String getEditorial();
}
