package PROVA;
import java.util.ArrayList;
import java.util.List;

class EventoShow extends Evento {
    enum TipoIngresso {
        VIP, PISTA
    }

    private List<String> participantesVIP;
    private List<String> participantesPista;

    public EventoShow() {
        super();
        this.participantesVIP = new ArrayList<>();
        this.participantesPista = new ArrayList<>();
    }

    public void adicionarParticipante(String nome, TipoIngresso tipoIngresso) {
        if (tipoIngresso == TipoIngresso.VIP) {
            participantesVIP.add(nome);
            System.out.println("Participante " + nome + " adicionado ao VIP.");
        } else if (tipoIngresso == TipoIngresso.PISTA) {
            participantesPista.add(nome);
            System.out.println("Participante " + nome + " adicionado à Pista.");
        }
        super.adicionarParticipante(nome);
    }

    @Override
    public void cancelarParticipacao(String nome) {
        if (participantesVIP.remove(nome)) {
            System.out.println("Participação VIP de " + nome + " no show cancelada com reembolso parcial.");
        } else if (participantesPista.remove(nome)) {
            System.out.println("Participação na Pista de " + nome + " no show cancelada com reembolso parcial.");
        } else {
            System.out.println("Participante " + nome + " não encontrado no show.");
        }
        super.cancelarParticipacao(nome);
    }
}
