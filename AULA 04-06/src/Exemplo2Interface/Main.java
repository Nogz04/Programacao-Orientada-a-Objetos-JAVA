package Exemplo2Interface;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("55984039186", "matheusna2004@gmail.com");

        smartphone.exibirDados();

            System.out.println();

        smartphone.verificarEmail();

         System.out.println();

        smartphone.realizarChamada();

    }
}
