package s20_pooInterfaces.impresora;

public class Pagina extends Hoja implements Imprimible {

    public Pagina(String contenido){
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
