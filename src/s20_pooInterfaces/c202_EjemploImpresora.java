package s20_pooInterfaces;

import s20_pooInterfaces.impresora.*;
import static s20_pooInterfaces.impresora.CatGenero.*;


public class c202_EjemploImpresora {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Aprendi sobre un lenjuage llamado java, ademas de saber sobre bases de datos no relacionales usando MySQL", "Marcos del Carmen","Ingeniero en sistemas");
        cv.addExperiencia("Java");
        cv.addExperiencia("JavaScript");
        cv.addExperiencia("Angular");
        cv.addExperiencia("Laravel");

        imprimir(cv);

        Informe ins = new Informe("Injecciones en bases de datos no relacionales en la plataforma SAM", "Marcos del Carmen", "Eduardo Pascual");
        System.out.println("--------------------------------------------");
        imprimir(ins);

        Libro l1 = new Libro("Patrones de diseño: Elemn Reusables POO","Eric Fowler", PROGRAMACION);
        l1.addPagina(new Pagina("Patron Fascade"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"));
        System.out.println("--------------------------------------------");
        imprimir(l1);
    }

    public static void imprimir(Imprimible imp) {
        System.out.println(imp.imprimir());
    }
}
