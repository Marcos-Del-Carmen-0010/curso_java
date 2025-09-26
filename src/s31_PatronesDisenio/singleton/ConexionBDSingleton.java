package s31_PatronesDisenio.singleton;

public class ConexionBDSingleton {
    public static ConexionBDSingleton instance;

    public ConexionBDSingleton() {
        System.out.println("Conectandose algún motor de base de datos.");
    }

    public static ConexionBDSingleton getInstance() {
        if (instance == null) {
            instance = new ConexionBDSingleton();
        }
        return instance;
    }
}
