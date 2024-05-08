package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria();

        conta1.setSaldo(0);
        conta1.setLimite(2000);


        System.out.println("Digite o valor de saque: ");
        conta1.saque(sc.nextDouble());

        System.out.println("\nSALDO: " + conta1.getSaldo());
        System.out.println("LIMITE ATUALIZADO: " + conta1.getLimite());
    }
}
