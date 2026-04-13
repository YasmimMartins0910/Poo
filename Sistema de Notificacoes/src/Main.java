public class Main {
    public static void main(String[] args) {

        Notificacao notificacao = new Notificacao();

        notificacao.enviar();
        notificacao.enviar("Promoção disponível!");
        notificacao.enviar("Olá!", "yasmim@email.com");
        notificacao.enviar("Alerta urgente", "99999-9999", 5);

        System.out.println();

        NotificacaoEmail email = new NotificacaoEmail("Bem-vinda!", "maria@email.com");
        NotificacaoSMS sms = new NotificacaoSMS("Seu código é 1234", "99999-9999");
        NotificacaoPush push = new NotificacaoPush("Nova mensagem", "Geneci");

        email.enviar();
        sms.enviar();
        push.enviar();
    }
}