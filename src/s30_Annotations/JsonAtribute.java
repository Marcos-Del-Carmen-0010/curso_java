package s30_Annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtribute {
    String nombre() default "";
    boolean capitalizar() default false;
}
