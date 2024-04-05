package ex6;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        int v1;
        int v2;
        int v3;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        v1 = teclado .nextInt();

        System.out.print("Digite o segundo valor: ");
        v2 = teclado .nextInt();

        System.out.print("Digite o terceiro valor: ");
        v3 = teclado .nextInt();


        System.out.println();
        System.out.println("VALORES DIGITADOS:");
        System.out.println("PRIMEIRO VALOR:" +v1);
        System.out.println("SEGUNDO VALOR:" +v2);
        System.out.println("TERCEIRO VALOR:" +v3);
        System.out.println();

        if(v1>v2 && v1>v3) {

            System.out.print("O primeiro número que é: " +v1+ ", é o maior!");
        }
        else if (v2>v1 && v2>v3) {

            System.out.print("O segundo número que é: " +v2+ ", é o maior!");
        }
        else if (v3>v1 && v3>v2) {

            System.out.print("O terceiro número que é: " +v3+ ", é o maior!");
        }


    }
}



