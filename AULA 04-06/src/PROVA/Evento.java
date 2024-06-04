package PROVA;
import java.util.ArrayList;
import java.util.List;

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
