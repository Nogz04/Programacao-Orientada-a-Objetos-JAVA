package Exercicios;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Selecione a operação:");
            System.out.println("1. Adição (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");

            int opcao = scanner.nextInt();
            double num1, num2;
            char operacao = ' ';

            switch (opcao) {
                case 1:
                    operacao = '+';
                    break;
                case 2:
                    operacao = '-';
                    break;
                case 3:
                    operacao = '*';
                    break;
                case 4:
                    operacao = '/';
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextDouble();

            if (operacao == '/' && num2 == 0) {
                System.out.println("Não é possível dividir por zero."); //Tive que colocar a Exceção de divisão por 0 aqui pois não estava funcionando em try com outra ja existente
                return;
            }

            double resultado = calcular(num1, num2, operacao);
            System.out.println("Resultado: " + resultado);

        } catch (java.util.InputMismatchException e) { //Exceção para caso a entrada de um dos inputs seja String/Char
            System.out.println("ERRO: Entrada inválida. Por favor, insira um número válido." + " ("+e.getMessage()+")");
        } finally {
            scanner.close();
        }
    }

    public static double calcular(double num1, double num2, char operacao) {
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }
}

