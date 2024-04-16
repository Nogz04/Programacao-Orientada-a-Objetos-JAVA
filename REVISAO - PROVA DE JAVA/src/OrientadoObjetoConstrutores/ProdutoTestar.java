package OrientadoObjetoConstrutores;

public class ProdutoTestar {
    public static void main(String[] args) {


        //Construtor PADRÃO:
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca =  "Bic";
        p1.valor = 1.50f;


        //Construtor de DOIS parâmetros:
        Produto p2 = new Produto("Caneta Vermelha", "Faber");
        p2.valor = 1.69f;

        //Construtor de TRÊS parâmetros:
        Produto p3 = new Produto("Borracha", "Mercur", 1.89f);

        //Objeto p1:
        System.out.printf("NOME: " + p1.nome + "\nMARCA: " + p1.marca + "\nVALOR: R$" +p1.valor);

        //Objeto p3:
        System.out.printf("\n\nNOME: " + p2.nome + "\nMARCA: " + p2.marca + "\nVALOR: R$" +p2.valor);

        //Objeto p3:
        System.out.printf("\n\nNOME: " + p3.nome + "\nMARCA: " + p3.marca + "\nVALOR: R$" +p3.valor);
    }
}
