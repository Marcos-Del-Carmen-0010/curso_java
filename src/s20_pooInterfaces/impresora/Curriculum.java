package s20_pooInterfaces.impresora;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String exp) {
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona: " + this.persona + "\n")
            .append("Carrera: " + this.carrera + "\n")
            .append("Contenido: "+contenido + "\n")
        .append("Experiencias\n");
        for(String exp: this.experiencias) {
            sb.append("- " + exp + "\n");
        }
        return sb.toString();
    }
}
