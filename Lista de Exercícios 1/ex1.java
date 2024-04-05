package ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float n1;
        float n2;
        float soma;
        float subtracao;
        float divisao;
        float multiplicacao;

        Scanner teclado = new Scanner(System.in);


        System.out.print("Digite o primeiro numero: ");
        n1 = teclado .nextFloat ();


        System.out.print("Digite o primeiro numero: ");
        n2 = teclado .nextFloat();

        soma = n1+n2;
        subtracao = n1-n2;
        divisao = n1/n2;
        multiplicacao = n1*n2;

        System.out.println("Soma: " +soma);
        System.out.println("Subtração: " +subtracao);
        System.out.println("Divisão: " +divisao);
        System.out.println("Multiplicação: " +multiplicacao);

        System.out.println();
    }
}
