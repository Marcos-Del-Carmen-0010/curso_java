package s19_herenciaAndAbstract;

import s19_herenciaAndAbstract.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");


        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");

        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "PHP"));
        lenguaje.addOpcion(new Opcion("4", "C#"));
        lenguaje.addOpcion(new Opcion("5", "C++"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHTML() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("hola que tal es un input desabilitado!");

        username.setValor("mar.csd");
        password.setValor("a1b2c3");
        email.setValor("marcos@gmail.com");
        edad.setValor("23");

        java.setSelected(true);
        experiencia.setValor("... un año de expereriencia en la empresa softura solutions");
        // esta es una manera de hacerlo usando ArrayList
        // List<ElementoForm> elementos = new ArrayList<>();
        // elementos.add(username);
        // elementos.add(password);
        // elementos.add(email);
        // elementos.add(edad);
        // elementos.add(experiencia);
        // elementos.add(lenguaje);

        // esta es otra más corta usando Arrays ademas de asList
        List<ElementoForm> elementos = Arrays.asList(username, password, email, edad, experiencia, lenguaje, saludar);
        // for (ElementoForm e : elementos) {
        //    System.out.println(e.dibujarHTML());
        // }
        elementos.forEach(e -> {
            System.out.println(e.dibujarHTML());
        });
    }
}
