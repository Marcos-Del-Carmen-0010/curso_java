package s31_PatronesDisenio.composite.cofre;

import java.util.ArrayList;
import java.util.List;

public class Cofre implements Item {
    private String nombreCofre;
    private List<Item> almacenamiento = new ArrayList<>();

    public Cofre(String nombreCofre) {
        this.nombreCofre = nombreCofre;
    }

    public void addItem(Item i){
        this.almacenamiento.add(i);
    }

    public void removeItem(Item i){
        this.almacenamiento.remove(i);
    }

    @Override
    public void usar() {
        System.out.println("El cofre almacena " + this.nombreCofre);
        for (Item i : almacenamiento) {
            i.usar();
        }
    }
}
