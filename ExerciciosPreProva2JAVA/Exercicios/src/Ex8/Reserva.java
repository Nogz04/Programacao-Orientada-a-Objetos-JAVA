package Ex8;

class Reserva {
    private String descricao;

    public Reserva(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionar() {
        System.out.println("Reserva adicionada: " + descricao);
    }

    public void cancelar() {
        System.out.println("Reserva cancelada: " + descricao);
    }
}
