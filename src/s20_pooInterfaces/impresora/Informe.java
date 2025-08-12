package s20_pooInterfaces.impresora;

public class Informe extends Hoja implements Imprimible {

    private String autor;
    private String revisor;

    public Informe(String contenido, String autor, String revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Escrito por: " + this.autor + "" +
                "\nRevisado por: " + this.revisor + "" +
                "\nContenido: " +
                "\n" + this.contenido;

    }
}
