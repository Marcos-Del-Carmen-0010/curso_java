package s31_PatronesDisenio.decoradorNotificador;

public class NotificacionLog implements Notificador {
    private Notificador wrappee;

    public NotificacionLog(Notificador mensaje) {
        this.wrappee = mensaje;
    }

    @Override
    public void enviar(String mensaje) {
        wrappee.enviar(mensaje);
        System.out.println("Tienes un log: " + mensaje);
    }
}
