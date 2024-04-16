package ex2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual construtor você quer usar? ");
        System.out.println("\n1 - Nome e Espécie");
        System.out.println("2- Nome");
        System.out.println("Escolha: ");
        int escolha = teclado.nextInt();
        teclado.nextLine(); //Limpar buffer

        if(escolha == 1){
            System.out.println("\nDigite o nome do Animal: ");
            String nome = teclado.nextLine();

            System.out.println("Digite a especie do Animal: ");
            String especie = teclado.nextLine();

            Animal a1 =  new Animal(nome, especie);

            System.out.println("\nNOME: " +a1.nome + "\nESPÉCIE: " + a1.especie);
        }
        else if (escolha == 2) {
            System.out.println("Digite o nome do animal: ");
            String nome = teclado.nextLine();

            Animal a1 =  new Animal(nome);

            System.out.println("\nNOME: " + a1.nome);
        }


    }

}
