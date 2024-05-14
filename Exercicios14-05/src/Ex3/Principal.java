package Ex3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa =  new Pessoa();

        System.out.println("Digite a mensagem e depois o numero de repeticoes: ");
        pessoa.falar(sc.nextLine(), sc.nextInt());
    }
}
