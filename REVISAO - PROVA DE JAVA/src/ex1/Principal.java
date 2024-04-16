package ex1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado =  new Scanner(System.in);

        int opcao;

        System.out.println("Qual construtor quer usar? ");
        System.out.println("\n1 - Nome e Preço");
        System.out.println("2 - Nome");
        System.out.println("Escolha sua opção: ");
        opcao = teclado.nextInt();

        if (opcao == 1) {
           teclado.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nome = teclado.nextLine();

            System.out.println("\nDigite o preço do produto: ");
            float preco = teclado.nextFloat();

            Produto p1 = new Produto(nome, preco);

            System.out.println("\nPRODUTO CRIADO!");
            System.out.println("\nNOME: " + p1.nome + "\nPREÇO: " +p1.preco);

        } else if (opcao == 2) {

            teclado.nextLine();
            System.out.println("\nDigite o nome do produto: ");
            String nome = teclado.nextLine();

            Produto p1 = new Produto(nome);
            System.out.println("\nPRODUTO CRIADO!");
            System.out.println("\nNOME: " + p1.nome);
        }


    }
}
