package s14_POO.OrdenPago;

public class Cliente {
    private int id;
    private static int idFinal = 0;
    private String nombre;
    private String apellido;

    Cliente(String nombre, String apellido) {
        this.id = idFinal++;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

}
