package s21_pooCRUDInterface.Modelo;

public class Cliente extends BaseEntity {
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Cliente(String nombre, String apellido) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "nombre: " + this.nombre + "\n" +
                "apellido: " + this.apellido;
    }
}
