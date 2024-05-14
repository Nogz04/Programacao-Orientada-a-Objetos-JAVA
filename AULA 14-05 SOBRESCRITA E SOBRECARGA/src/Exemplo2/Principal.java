package Exemplo2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        System.out.println("Escolha uma opção: ");
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();

        if(opcao == 1) {
            Pessoa pessoa1 = new Pessoa();
            pessoa1.trabalhar();
        } else if (opcao == 2) {
            Pessoa pessoa2 = new Programador();
            pessoa2.trabalhar();
        }


    }
}
