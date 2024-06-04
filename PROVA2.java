import java.util.ArrayList;
import java.util.List;

// Classe base Evento
class Evento {
    private List<String> participantes;

    public Evento() {
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante(String nome) {
        participantes.add(nome);
    }

    public void cancelarParticipacao(String nome) {
        if (participantes.remove(nome)) {
            System.out.println("Participação de " + nome + " cancelada com sucesso.");
        } else {
            System.out.println("Participante " + nome + " não encontrado.");
        }
    }

    protected List<String> getParticipantes() {
        return participantes;
    }
}

// Classe derivada EventoConferencia
class EventoConferencia extends Evento {
    @Override
    public void cancelarParticipacao(String nome) {
        if (getParticipantes().remove(nome)) {
            System.out.println("Participação de " + nome + " na conferência cancelada com reembolso total.");
        } else {
            System.out.println("Participante " + nome + " não encontrado na conferência.");
        }
    }
}

// Classe derivada EventoShow
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

// Classe de Teste
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
