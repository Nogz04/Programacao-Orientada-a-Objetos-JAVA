package PROVA;

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

