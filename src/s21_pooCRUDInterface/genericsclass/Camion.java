package s21_pooCRUDInterface.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion <T> implements Iterable<T> {
    public int max;
    public List objetos;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void addElemento(T camion) {
        if(this.objetos.size() <= this.max) {
            this.objetos.add(camion);
        } else {
            throw new RuntimeException("no hay más espacio.");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
