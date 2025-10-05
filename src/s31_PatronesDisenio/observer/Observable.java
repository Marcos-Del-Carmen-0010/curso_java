package s31_PatronesDisenio.observer;
/**
 * Tenemos una lista en la cual podemos agregar observadores
 * y podemos tener bastantes de ellos
 * ademas de notificar a las objetos que estan suscritos
 * */

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
