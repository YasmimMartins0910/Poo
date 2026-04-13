public class NotificacaoEmail extends Notificacao {

    public NotificacaoEmail(String mensagem, String destinatario) {
        super(mensagem, destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando e-mail para " + getDestinatario());
    }
}