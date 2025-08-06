package s19_herenciaAndAbstract.validador;

public class LargoValidador extends Validador {
    protected  String mensaje = "el campo debe tener minimo %d caracteres y maximo de % caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {}

    public LargoValidador(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        this.mensaje = String.format(this.mensaje, min, max);
        if (valor != null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }

    @Override
    public String getMensaje() {
        return "";
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
