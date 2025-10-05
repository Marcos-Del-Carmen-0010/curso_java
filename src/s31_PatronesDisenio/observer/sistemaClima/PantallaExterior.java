package s31_PatronesDisenio.observer.sistemaClima;

public class PantallaExterior {
    public static void main(String[] args) {
        EstacionClima estClima = new EstacionClima("Chilapita", 23);
        estClima.addObserver(obj->{
            System.out.println("Marcos estamos a " + ((EstacionClima)obj).getTemperatura() + "°C");
        });
        estClima.addObserver(obj->{
            System.out.println("Damian estamos a " + ((EstacionClima)obj).getTemperatura() + "°C");
        });
        estClima.addObserver(obj->{
            System.out.println("Luis estamos a " + ((EstacionClima)obj).getTemperatura() + "°C");
        });
        estClima.setTemperatura(20);
    }
}
