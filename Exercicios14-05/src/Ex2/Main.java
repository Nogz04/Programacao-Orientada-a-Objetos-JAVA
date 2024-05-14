package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaCorrente conta1 = new ContaCorrente();

        System.out.println("Digite o seu saldo, o quanto quer sacar e o quanto quer depositar, respecitamente: ");
        conta1.calcularSaldo(sc.nextFloat(), sc.nextFloat(),sc.nextFloat());


    }
}
