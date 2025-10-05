package s31_PatronesDisenio.decoradorNotificador;

public class NotificacionSMS implements Notificador {
    private Notificador wrappee;

    public NotificacionSMS(Notificador wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void enviar(String mensaje) {
        wrappee.enviar(mensaje);
        System.out.println("Tienes un SMS: " + mensaje);
    }
}
