package s24_EstructuraDeDatos.map;

import java.util.*;

public class c241_ejemTreeMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new TreeMap<>((a, b) -> b.compareTo(a));
        persona.put("id_persona", "1001");
        persona.put("nombre", "Marcos");
        persona.put("apellido_paterno", "Sánchez");
        persona.put("apellido_materno", "del Carmen");
        persona.put("edad", 23);
        System.out.println(persona);

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "México");
        direccion.put("estado", "Guerrero");
        direccion.put("ciudad", "Chilapa de Alvarez");
        direccion.put("calle", "18 sur");
        direccion.put("num_exterior", "202 A");

        persona.put("direccion", direccion);

        System.out.println("....:::::: DATOS DE PERSONA \n"+ persona);
    }
}
