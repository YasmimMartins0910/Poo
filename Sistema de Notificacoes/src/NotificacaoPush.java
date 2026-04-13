public class NotificacaoPush extends Notificacao {

    public NotificacaoPush(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificação push para " + getDestinatario());
    }
}