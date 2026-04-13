public class Notificacao {
    // Encapsulamento
    private String mensagem;
    private String destinatario;

    // Construtor vazio
    public Notificacao() {
    }

    public Notificacao(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    // Método normal
    public void enviar() {
        System.out.println("Enviando notificação genérica.");
    }

    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }

    public void enviar(String mensagem, String destinatario) {
        System.out.println("Enviando mensagem: " + mensagem + " para " + destinatario);
    }

    public void enviar(String mensagem, String destinatario, int prioridade) {
        System.out.println("Enviando mensagem: " + mensagem + " para " + destinatario + " com prioridade " + prioridade);
    }
}