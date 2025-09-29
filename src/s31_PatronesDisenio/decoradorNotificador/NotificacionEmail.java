package s31_PatronesDisenio.decoradorNotificador;

public class NotificacionEmail implements Notificador {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Tienes un correo:" + mensaje);
    }
}
