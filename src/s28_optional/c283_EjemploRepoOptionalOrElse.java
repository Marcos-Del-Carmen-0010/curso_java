package s28_optional;

import s28_optional.interfaces.Repositorio;
import s28_optional.models.Computador;
import s28_optional.repositorio.ComputadorRepositorio;

import java.util.Optional;

public class c283_EjemploRepoOptionalOrElse {
    public static void main(String[] args) {
        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Computador pc;

//        pc = repositorio.filtrar("rog").orElse(valorDefecto());
//        System.out.println(pc);

        pc = repositorio.filtrar("macbook").orElseGet(c283_EjemploRepoOptionalOrElse::valorDefecto);
        System.out.println(pc);

        String  archivo = "datos.pdf";
        String extencion = Optional.ofNullable(archivo)
                .filter(a-> a.contains("."))
                .map(a-> a.substring(archivo.lastIndexOf(".")+1))
                .orElseThrow();
        System.out.println("Extención de archivo: " + extencion);

    }

    public static Computador valorDefecto() {
        System.out.println("Mostramos el valor por defecto!!");
        return new Computador("HP Omen", "LA0001");
    }
}
