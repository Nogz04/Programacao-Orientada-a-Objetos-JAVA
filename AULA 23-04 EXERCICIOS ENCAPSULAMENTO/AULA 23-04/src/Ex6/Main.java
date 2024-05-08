package Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado =  new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("Digite o nome da pessoa: ");
        p.setNome(teclado.nextLine());

        System.out.println("Digite a idade da pessoa: ");
        p.setIdade(teclado.nextInt());

        System.out.println("Digite o CPF da pessoa: ");
        p.setCPF(teclado.next());

        System.out.println("\n=======================");
        System.out.println("INFORMAÇÕES DA PESSOA");
        System.out.println("=======================\n");

        System.out.println("NOME: " + p.getNome());
        System.out.println("\nIDADE: " + p.getIdade());
        System.out.println("\nCPF: " + p.getCPF());
        System.out.println("\n================================");
        System.out.println("VERIFICANDO SE É MAIOR DE IDADE: ");
        System.out.println("================================\n");
        p.verificarMaiorDeIdade();


    }
}
