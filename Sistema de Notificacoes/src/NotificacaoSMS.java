public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para " + getDestinatario());
    }
}