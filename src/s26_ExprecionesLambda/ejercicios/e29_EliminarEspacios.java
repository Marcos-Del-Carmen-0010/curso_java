package s26_ExprecionesLambda.ejercicios;

public class e29_EliminarEspacios {

    public static void main(String[] args) {

        // EXPRECIÓN NORMAL (POR LO QUE PIENSO)
        FunctionsGeneral b = new FunctionsGeneral() {
            @Override
            public String quitarEspacios(String texto) {
                return texto.replaceAll("[\\s.,]", "").toUpperCase();
            }
        };

        // EXPRECIÓN LAMBDA
        FunctionsGeneral t = texto -> {
            return texto.replaceAll("[\\s.,]", "").toUpperCase();
        };

        System.out.println(
                t.quitarEspacios("Voy a quitar los espacios en blanco, comas, " +
                        "puntos y lo voy a mostrar en mayusculas")
        );
    }
}
