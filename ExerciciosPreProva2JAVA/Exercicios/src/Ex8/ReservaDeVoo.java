package Ex8;

class ReservaDeVoo extends Reserva {
    private String classe;

    public ReservaDeVoo(String descricao, String classe) {
        super(descricao);
        this.classe = classe;
    }

    public void adicionar(String tipo) {
        System.out.println("Reserva de voo adicionada: " + getDescricao() + ", Classe: " + classe + ", Tipo: " + tipo);
    }

    public String getClasse(){
        return classe;
    }

    public void setClasse(String classe){
        this.classe = classe;
    }

    @Override
    public void cancelar() {
        System.out.println("Política de cancelamento de reserva de voo: taxa de cancelamento aplicável.");
        super.cancelar();
    }
}
