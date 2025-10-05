package s24_EstructuraDeDatos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c240_ejemHashMap {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        persona.put("id_persona", "1001");
        persona.put("nombre", "Marcos");
        persona.put("apellido_paterno", "Sánchez");
        persona.put("apellido_materno", "del Carmen");
        persona.put("edad", 23);
        System.out.println(persona);

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "México");
        direccion.put("estado", "Guerrero");
        direccion.put("ciudad", "Chilapa de Alvarez");
        direccion.put("calle", "18 sur");
        direccion.put("num_exterior", "202 A");

        persona.put("direccion", direccion);
        System.out.println(".....:::::DATOS DE LA PERSONA INCLUYENDO LA DIRECCIÓN");
        System.out.println(persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("Nombre de la persona: " + nombre);
        String apellido_paterno = (String) persona.get("apellido_paterno");
        System.out.println("Apellido de la persona: " + apellido_paterno);
        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playita");
        System.out.println("El pais de " +  nombre + " es "+ pais);
        System.out.println("La ciudad de " + nombre + " es "+ ciudad);
        System.out.println("El barrio de " + nombre + " es "+ barrio);

        boolean b = persona.remove("apellido_paterno", "Sánchez");
        System.out.println("El apellido de la persona fue removido: " + b);

        boolean b2 = persona.containsKey("apellido_paterno");
        System.out.println("Esta el atributo de apellido paterno: " + (b2 ? "Si" : "No"));

        b2 = persona.containsValue("Del Carmen");
        System.out.println("Esta el valor de apellido materno: " + (b2 ? "Si" : "No"));

        Collection<Object> personas = persona.values();
        for (Object persona1 : personas) {
            System.out.println("v: " + persona1);
        }

        Set<String> personas2 = persona.keySet();
        for (String persona2 : personas2) {
            System.out.println("k: " + persona2);
        }

        System.out.println("....::::::: ATRIBUTOS Y VALORES USANDO MAP.ENTRY");
        for(Map.Entry<String, Object> entry : persona.entrySet()) {
            Object valor = entry.getValue();
            if (valor instanceof Map) {
                for (Map.Entry<String, Object> entry2 : persona.entrySet()) {
                    System.out.println(entry2.getKey() + "=>" + entry2.getValue());
                }
            } else {
                System.out.println(entry.getKey() + "=>" + entry.getValue());
            }
        }

        System.out.println("....::::::: ATRIBUTOS Y VALORES USANDO METODO VALUES");
        // for (Object llave: persona.values()) {
        for(Map.Entry<String, Object> llave : persona.entrySet()) {
            // Object valor = persona.get(llave);
            Object valor = llave.getValue();
            if(valor instanceof Map) {
                Map<String, Object> personaMap = (Map<String, Object>) valor;
                System.out.println("Pais => " + personaMap.get("pais"));
                System.out.println("Estado => " + personaMap.get("estado"));
                System.out.println("Ciudad => " + personaMap.get("ciudad"));
            } else {
                // System.out.println(llave + "=>" + valor);
                System.out.println(llave.getKey() + "=>" + llave.getValue());
            }
        }

        System.out.println("....::::::: ATRIBUTOS Y VALORES USANDO EXPRESION LAMDA");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + "=>" + valor);
        });

        System.out.println("Total de atributos: " + persona.size());
        System.out.println("Es diferente de vacio: " + !persona.isEmpty());

        // persona.replace("nombre", "Emilio");
        b2 = persona.replace("nombre", persona.get("nombre"),"Emilio");
        System.out.println("Se hace un cambio de nombre: " + b2);
        System.out.println("Persona: " + persona);
    }
}
