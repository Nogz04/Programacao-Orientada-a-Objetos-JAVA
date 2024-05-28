package Ex7;

public class NotificacaoApp extends Notificacao {

    @Override
    public void enviar(String mensagemNotificacao, Destinatario destinatario) {
        System.out.println("Enviando notificação pelo app DuoLingo para " + destinatario.getNome() + ": " + mensagemNotificacao);
        System.out.println();
    }
}
