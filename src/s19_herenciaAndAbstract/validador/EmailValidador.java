package s19_herenciaAndAbstract.validador;

public class EmailValidador extends Validador {
    protected String mensaje = "el formato del email es invalido";
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";

    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
