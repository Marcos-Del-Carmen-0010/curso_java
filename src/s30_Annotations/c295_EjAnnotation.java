package s30_Annotations;

import s30_Annotations.models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class c295_EjAnnotation {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("Mesa de centro");
        p.setPrecio(1000L);

        System.out.println(JsonSerializador.toJson(p));

    }
}
