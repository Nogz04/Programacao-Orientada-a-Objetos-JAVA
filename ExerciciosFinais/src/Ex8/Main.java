package Ex8;

public class Main {
    public static void main(String[] args) {

        Produto livro = new Livro("O senhor dos Anéis", 150.00, "O Senhor dos Anéis é um livro de alta fantasia, escrito pelo escritor britânico J. R. R. Tolkien.");
        Produto CD = new CD("Astroworld", 7000.00, "Astroworld é o terceiro álbum de estúdio do rapper norte-americano Travis Scott.");

        System.out.println("\n=====INFORMAÇÕES DO LIVRO=====");
        System.out.println("Nome: " + livro.getNome());
        System.out.println("Preço: " + livro.getPreco());
        System.out.println("Descrição: " + livro.getDescricao());

        System.out.println("\n=====INFORMAÇÕES DO CD=====");
        System.out.println("Nome: " + CD.getNome());
        System.out.println("Preço: " + CD.getPreco());
        System.out.println("Descrição: " + CD.getDescricao());
    }
}
