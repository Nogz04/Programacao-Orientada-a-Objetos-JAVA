package Ex5;

public class Produto {

    private double preco;
    private String nome;

    public Produto(String nome, double preco) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPrecoFinal(double preco){
        return this.preco;
    }

    public double calcularPrecoFinal(Cliente cliente){
        return this.preco * (1 - cliente.getDesconto()/100);
    }

}
