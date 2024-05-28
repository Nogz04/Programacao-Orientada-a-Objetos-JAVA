package Ex7;

public class Notificacao {

    protected String mensagemNotificacao;

    public String getMensagemNotificacao() {
        return mensagemNotificacao;
    }

    public void setMensagemNotificacao(String mensagemNotificacao) {
        this.mensagemNotificacao = mensagemNotificacao;
    }

    public void enviar(String mensagemNotificacao, Destinatario destinatario) {
        System.out.println("Enviando notificação para " + destinatario.getNome() + ": " + mensagemNotificacao);
    }
}
