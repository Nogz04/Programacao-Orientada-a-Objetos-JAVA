package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProdutoComDesconto p1 =  new ProdutoComDesconto("iPhone 15", 8000);

        System.out.println("Informe o NOME e o VALOR do produto, aperte ENTER em ambos: ");
        ProdutoComDesconto p2 =  new ProdutoComDesconto(sc.nextLine(), sc.nextDouble());


        System.out.println("\nPRODUTO 1: "); //Valor definido no código-fonte
        System.out.println("\nNome do Produto: " + p1.getNome());
        System.out.println("Preço do Produto: " + p1.getPreco());
        p1.desconto();

        System.out.println("\n============================");

        System.out.println("\nPRODUTO 2: "); //Valor das varíaveis informados pelo usuário
        System.out.println("\nNome do Produto: " + p2.getNome());
        System.out.println("Preço do Produto: " + p2.getPreco());
        p2.desconto();

    }
}
