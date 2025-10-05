package s31_PatronesDisenio.decoradorNotificador;

public class Dispositivo {
    public static void main(String[] args) {
        Notificador notificador = new NotificacionEmail();
        notificador = new NotificacionSMS(notificador);
        notificador = new NotificacionLog(notificador);
        notificador.enviar("Holaaa, sean todos bienvenidos a nuestra plataforma...");
    }
}
