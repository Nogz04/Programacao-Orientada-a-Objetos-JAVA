package Ex8;

class ReservaDeHotel extends Reserva {
    private int numeroDeNoites;

    public ReservaDeHotel(String descricao, int numeroDeNoites) {
        super(descricao);
        this.numeroDeNoites = numeroDeNoites;
    }

    public int getNumeroDeNoites() {
        return numeroDeNoites;
    }

    public void setNumeroDeNoites(int numeroDeNoites) {
        this.numeroDeNoites = numeroDeNoites;
    }

    @Override
    public void cancelar() {
        System.out.println("Política de cancelamento de reserva de hotel: reembolso total até 24 horas antes.");
        super.cancelar();
    }
}