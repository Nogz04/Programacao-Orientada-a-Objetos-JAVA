package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.print("\n1- Deposito normal");
            System.out.print("\n2- Depositar cheque");
            System.out.println("\n3- Sair");
            System.out.print("Escolha sua opcao: ");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do depósito: ");
                    double valor = sc.nextDouble();
                    c1.depositar(valor);
                    break;

                    case 2:
                        System.out.println("Informe o valor do cheque: ");
                        double valorCheque = sc.nextDouble();
                        Cheque cheque = new Cheque(valorCheque);
                        c1.depositar(cheque);
                        break;

                        case 3:
                            System.out.println("Saindo...");
                            break;

            }
        }

    }
}
