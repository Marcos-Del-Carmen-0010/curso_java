package s19_herenciaAndAbstract.validador;

public class NoNuloValidador extends Validador{
    public String mensaje = "el campo %s no puede ser nulo";

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}