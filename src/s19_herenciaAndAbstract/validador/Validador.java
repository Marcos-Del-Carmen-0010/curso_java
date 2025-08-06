package s19_herenciaAndAbstract.validador;

abstract public class Validador {
    protected String mensaje;

    abstract public boolean esValido(String valor);
    abstract public String getMensaje();
    abstract public void setMensaje(String mensaje);

}
