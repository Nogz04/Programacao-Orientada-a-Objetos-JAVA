package ex9;

import java.util.Scanner;

public class Main{


public static void main(String[] args) {

    int idade;


    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    idade = teclado.nextInt();

    if (idade < 16){

        System.out.println("Você não está apto a votar.");

    }
    else if (idade == 16 || idade  == 17 ||idade > 70) {
        System.out.println("O voto é FACULTATIVO");
    }
    else {
        System.out.println("O voto é OBRIGATÓRIO");
    }




}
}
