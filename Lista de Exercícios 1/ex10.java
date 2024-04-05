package ex10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float n1;
        float n2;
        float resultado = 0;
        char operacao;
        int escolha;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha o modo de operação:");
        System.out.println("1 - Inserir números para escolher a operação");
        System.out.println("2 - Inserir caracteres para escolher a operação");
        System.out.print("Escolha: ");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o primeiro numero: ");
                n1 = teclado.nextFloat();

                System.out.print("Digite o segundo numero: ");
                n2 = teclado.nextFloat();

                System.out.print("Escolha a operação (1 - SOMA, 2 - SUBTRAÇÃO, 3 - MULTIPLICAÇÃO, 4 - DIVISÃO): ");
                int opcaoNumerica = teclado.nextInt();

                switch (opcaoNumerica) {
                    case 1:
                        resultado = n1 + n2;
                        break;
                    case 2:
                        resultado = n1 - n2;
                        break;
                    case 3:
                        resultado = n1 * n2;
                        break;
                    case 4:
                        if (n2 != 0) {
                            resultado = n1 / n2;
                        } else {
                            System.out.println("Não é possível dividir por zero.");
                            return; // Encerra o programa se a divisão por zero for tentada.
                        }
                        break;
                    default:
                        System.out.println("Operação numérica inválida.");
                        return; // Encerra o programa se a operação numérica for inválida.
                }
                break;

            case 2:
                System.out.print("Digite o primeiro numero: ");
                n1 = teclado.nextFloat();

                System.out.print("Digite o segundo numero: ");
                n2 = teclado.nextFloat();

                System.out.print("Escolha a operação (+ para soma, - para subtração, x para multiplicação, / para divisão): ");
                operacao = teclado.next().charAt(0);

                switch (operacao) {
                    case '+':
                        resultado = n1 + n2;
                        break;
                    case '-':
                        resultado = n1 - n2;
                        break;
                    case 'x':
                        resultado = n1 * n2;
                        break;
                    case '/':
                        if (n2 != 0) {
                            resultado = n1 / n2;
                        } else {
                            System.out.println("Não é possível dividir por zero.");
                            return; // Encerra o programa se a divisão por zero for tentada.
                        }
                        break;
                    default:
                        System.out.println("Operação de caractere inválida.");
                        return; // Encerra o programa se a operação de caractere for inválida.
                }
                break;

            default:
                System.out.println("Escolha inválida.");
                return; // Encerra o programa se a escolha for inválida.
        }

        System.out.println("Resultado: " + resultado);
    }
}
