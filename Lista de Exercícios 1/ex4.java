package ex4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;
        int n4;


        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o primeiro numero: ");
        n1 = teclado .nextInt();

        System.out.println();

        System.out.println("Digite o segundo numero: ");
        n2 = teclado .nextInt();

        System.out.println();

        System.out.println("Digite o terceiro numero: ");
        n3 = teclado .nextInt();

        System.out.println("Digite o quarto numero: ");
        n4 = teclado .nextInt();

        System.out.println();

        int media;
        media = (n1+n2+n3+n4)/4;

        System.out.println("Media: " +media);


        if(n1 > media) {
            System.out.println("N1 é maior que a media!");
        }

        else if(n2 > media) {
            System.out.println("N2 é maior que a media!");
        }

        else if(n3 > media) {
            System.out.println("N3 é maior que a media!");
        }

        else if(n4 > media) {
            System.out.println("N4 eh maior que a media!");
        }

    }
}


