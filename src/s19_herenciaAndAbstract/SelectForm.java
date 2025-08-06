package s19_herenciaAndAbstract;

import s19_herenciaAndAbstract.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    public List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public void addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
    }

    @Override
    public String dibujarHTML() {
        StringBuilder html = new StringBuilder("<select ");
        html.append("name='")
            .append(this.nombre)
            .append("'>");
        for (Opcion opcion : this.opciones) {
            html.append("\n<option value='")
                .append(opcion.getValor())
                .append("'");
            if(opcion.isSelected()) {
                html.append(" selected");
                this.valor = opcion.getValor();
            }
            html.append(">");
            html.append(opcion.getNombre())
                .append("</option>");
        }
        html.append("</select>");
        return html.toString();
    }
}
