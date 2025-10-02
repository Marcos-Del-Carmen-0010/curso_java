package s31_PatronesDisenio.composite.cofre;

public class ObjetoSimple implements Item {
    private String nombre;

    public ObjetoSimple(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void usar() {
        System.out.println("Items: " +  this.nombre);
    }
}
