package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nverifica;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        nverifica = teclado .nextInt();

        if(nverifica % 2 == 0) {

            System.out.print("O numero eh PAR! ");
        }
        else {
            System.out.print("O numero eh IMPAR! ");
        }

    }
}



