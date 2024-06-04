package PROVA;

public class TesteEvento {
    public static void main(String[] args) {
        EventoConferencia conferencia = new EventoConferencia();
        conferencia.adicionarParticipante("Alice");
        conferencia.adicionarParticipante("Bob");

        EventoShow show = new EventoShow();
        show.adicionarParticipante("Carlos", EventoShow.TipoIngresso.VIP);
        show.adicionarParticipante("Diana", EventoShow.TipoIngresso.PISTA);

        // Cancelando participações
        conferencia.cancelarParticipacao("Alice");
        show.cancelarParticipacao("Carlos");
        show.cancelarParticipacao("Diana");
    }
}