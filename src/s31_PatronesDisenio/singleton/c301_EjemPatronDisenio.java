package s31_PatronesDisenio.singleton;

public class c301_EjemPatronDisenio {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ConexionBDSingleton cbds = ConexionBDSingleton.getInstance();
            System.out.println("Conexión " + i + ": " + cbds);
        }

        ConexionBDSingleton cbds1 = ConexionBDSingleton.getInstance();
        System.out.println("Segunda conexión: " +cbds1);
        ConexionBDSingleton cbds2 = ConexionBDSingleton.getInstance();
        System.out.println("Tercera conexión: " + cbds2);

    }
}
