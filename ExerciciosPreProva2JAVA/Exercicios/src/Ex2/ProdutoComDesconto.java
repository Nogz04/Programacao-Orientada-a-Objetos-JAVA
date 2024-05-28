package Ex2;

public class ProdutoComDesconto extends Produto{

    private final double descontoPercentual = 0.5; //Definindo valor do desconto para 50%

    public ProdutoComDesconto(String nome, double preco) {
        super(nome, preco);
    }

    public double getPercentualDesconto() {
        return descontoPercentual;
    }

    @Override
    public void desconto() {
        super.desconto();
        double valorcomDesconto = getPreco()*descontoPercentual;
        System.out.println("Desconto: " +valorcomDesconto); //Valor do produto com 50% de desconto
    }
}
