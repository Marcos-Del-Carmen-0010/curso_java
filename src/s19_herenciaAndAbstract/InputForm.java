package s19_herenciaAndAbstract;

public class InputForm extends ElementoForm{
    public String tipo = "text";

    @Override
    public String dibujarHTML() {
        return "<input type=\"" + this.tipo +
                "\" name=\"" + this.nombre +
                "\" value=\"" + this.valor + "\"/>";
    }

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}