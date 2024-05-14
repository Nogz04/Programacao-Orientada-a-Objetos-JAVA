package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Casa casa = new Casa();
        Scanner sc = new Scanner(System.in);

        int tamanhoCasa; // em metros quadrados

        System.out.println("Digite o numero de m² da casa: ");
        tamanhoCasa = sc.nextInt();
        double precoCasa = casa.calcularPreco(tamanhoCasa);
        System.out.println("Preço da casa com " + tamanhoCasa + "m²: R$" + precoCasa);



        int numQuartos; //numero de quartos

        System.out.println("\nDigite o numero de quartos ");
        numQuartos = sc.nextInt();
        double precoCasaComQuartos = casa.calcularPreco(tamanhoCasa, numQuartos);
        System.out.println("Preço da casa com " + tamanhoCasa + "m² e " + numQuartos + " quartos: R$" + precoCasaComQuartos);
    }
}


