package s31_PatronesDisenio.observer.calabosos;

public class Nivel1 {
    public static void main(String[] args) {
        Jugador player1 = new Jugador("M3NT3 3NF3RM4", 30);
        Jugador player2 = new Jugador("LUJURIA 0001", 30);
        Jugador player3 = new Jugador("SNAKE", 30);

        player1.addObserver(obj -> {

        });
        player2.addObserver(obj -> {

        });
        player3.addObserver(obj -> {

        });


        player1.danioPorAtaqueFisico("Elfo oscuro", 20);


    }
}
