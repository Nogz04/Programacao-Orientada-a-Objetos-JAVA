package InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        try {
            System.out.println("Digite um número: ");
            numero = teclado.nextInt();
            System.out.println("Seu numero: " +numero);
        }catch (InputMismatchException e){
            System.out.println("ERRO: InputMismatchException = Erro ao digitar string em vez de número\n");
            System.out.println("Mensagem do sistema: " +e.getMessage());
        }


    }
}
