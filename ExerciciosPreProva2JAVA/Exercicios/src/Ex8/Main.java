package Ex8;

public class Main {
    public static void main(String[] args) {

        // Criando e cancelando uma reserva de hotel
        ReservaDeHotel reservaHotel = new ReservaDeHotel("Reserva de Hotel", 3);
        reservaHotel.adicionar();
        reservaHotel.cancelar();
        System.out.println();

        // Criando e cancelando uma reserva de voo
        ReservaDeVoo reservaVoo = new ReservaDeVoo("Reserva de Voo", "Econômica");
        reservaVoo.adicionar("Econômica");
        reservaVoo.cancelar();
        System.out.println();

        // Criando e cancelando uma reserva de voo com classe executiva
        ReservaDeVoo reservaVooExecutiva = new ReservaDeVoo("Reserva de Voo", "Executiva");
        reservaVooExecutiva.adicionar("Executiva");
        reservaVooExecutiva.cancelar();
    }
}




