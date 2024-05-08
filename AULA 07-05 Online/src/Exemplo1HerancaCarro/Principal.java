package Exemplo1HerancaCarro;

public class Principal {
    public static void main(String[] args) {

        Onibus o = new Onibus();
        o.setNome("Marcopolo");
        o.setModelo("OF-1519");

        o.exibeMsg();

        System.out.println("\nINFORMAÇÕES: \n");
        System.out.println("Nome do carro: " + o.getNome()); //Vem da classe carro
        System.out.println("Modelo do Onibus: " + o.getModelo()); //Vem da classe onibus

    }
}
