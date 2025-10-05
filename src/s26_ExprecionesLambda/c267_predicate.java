package s26_ExprecionesLambda;

import s26_ExprecionesLambda.models.Persona;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class c267_predicate {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println("Predicar un par: " + p.test(5));

        Predicate<String> permiso = rol -> rol.equals("ROL_ADMIN");
        System.out.println("Predicar una constante de rol: "+ permiso.test("ROL_CLIENTE"));

        BiPredicate<String, String> p2 = (a, b) -> a.equals(b);
        System.out.println("Predicar con nombres: "+  p2.test("pancho","pancracio"));

        BiPredicate<Integer, Integer> numeros = (x, y) -> x > y;
        System.out.println("Predicar con números: "+ numeros.test(1,2));

        Persona usu1 = new Persona();
        Persona usu2 = new Persona();

        usu1.setNombre("Miguel");
        usu2.setNombre("Miguel");

        BiPredicate<Persona, Persona> usuarios = (pa, pb) -> pa.getNombre().equals(pb.getNombre());
        System.out.println("Predicar con objetos: "+ usuarios.test(usu1, usu2));
    }
}
