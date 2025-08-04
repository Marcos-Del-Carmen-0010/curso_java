package s19_herenciaAndAbstract;

import java.util.List;

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;

    public ElementoForm() {}

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    abstract public String dibujarHTML();

    public void setValor(String valor) {
        this.valor = valor;
    }
}
