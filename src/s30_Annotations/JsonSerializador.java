package s30_Annotations;

import s30_Annotations.exception.JsonSerializadorException;

import java.lang.reflect.Field;
import java.util.Arrays;

public class JsonSerializador {
    public static String toJson(Object obj) {
        if (obj == null) {
            throw new JsonSerializadorException("El objeto senrializado no puede ser null!!");
        }

        Field[] atributos = obj.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtribute.class))
                .map(f-> {
                    f.setAccessible(true);
                    String nombre = f.getAnnotation(JsonAtribute.class).nombre().equals("")
                            ? f.getName()
                            : f.getAnnotation(JsonAtribute.class).nombre();
                    try {
                        Object valor = f.get(obj);
                        if (f.getAnnotation(JsonAtribute.class).capitalizar() && (valor instanceof String)) {
                            String nuevoValor = (String) valor;
                            nuevoValor = String.valueOf(nuevoValor.charAt(0)).toUpperCase() +
                                    nuevoValor.substring(1).toLowerCase();
                            f.set(obj, nuevoValor);
                        }
                        return "\""+ nombre + "\":\"" + f.get(obj) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a json: " + e.getMessage());
                    }
                })
                .reduce("{", (a,b)->{
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + "," + b;
                }).concat("}");
    }
}
