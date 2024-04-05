package ex8;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

       int n1;
       int n2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = teclado.nextInt();

        System.out.println("Digite o primeiro valor: ");
        n2 = teclado.nextInt();

        System.out.println();


        if (n1 == 0 && n2 == 0 ){
            System.out.println("0 é Multiplo de 0 pois 0 é multiplo de todos os números.");
        }
        else if (n1 % n2 == 0 ){

            System.out.println("SÃO MULTIPLOS!");

        }
        else {
            System.out.println("NÃO são  MULTIPLOS!");
        }

    }
}



