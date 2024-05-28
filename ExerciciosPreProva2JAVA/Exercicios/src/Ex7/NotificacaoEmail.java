package Ex7;

public class NotificacaoEmail extends Notificacao {

    @Override
    public void enviar(String mensagemNotificacao, Destinatario destinatario) {
        System.out.println("Enviando e-mail para " + destinatario.getEmail() + ": " + mensagemNotificacao);
        System.out.println();
    }


}
