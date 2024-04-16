package Exercicios;

import java.util.Scanner;

import java.util.InputMismatchException;


public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro: ");
            int num = scanner.nextInt();
            double raizQuadrada = Math.sqrt(num); //Função para raiz quadrada

            System.out.println("A raiz quadrada de " + num + " é: " + raizQuadrada);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Digite apenas números inteiros.");
        }
    }
}

