package ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float iniciodia;
        float finaldia;
        float totalkm;
        float mediaconsumo;
        float lucrodia;
        float valortotal;
        float litro;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o odometro do final do dia: ");
        iniciodia = teclado .nextFloat();

        System.out.println();

        System.out.print("Digite o odometro do inicio do dia: ");
        finaldia = teclado .nextFloat();

        System.out.println();

        totalkm = iniciodia - finaldia;
        System.out.println("Total quilometragem: " +totalkm);

        System.out.print("Digite a quantidade de combustivel colocado, em Litros: ");
        litro = teclado .nextFloat();


        System.out.print("Digite o valor total recebido: ");
        valortotal = teclado .nextFloat();


        mediaconsumo = totalkm/litro;
        System.out.println("Media de consumo: " +mediaconsumo);




        lucrodia = (float) (valortotal - (litro * 4.9));
        System.out.println("O Lucro do dia foi: " +lucrodia);

    }
}


