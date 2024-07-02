package TrabalhoFINAL;

public class Produtos {

    private int codigo;
    private String descricao;
    private double precoDeCusto;
    private double precoDeVenda;
    private int estoqueDisponivel;

    public Produtos(int codigo, String descricao, double precoDeCusto, double precoDeVenda, int estoqueDisponivel) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoDeCusto = precoDeCusto;
        this.precoDeVenda = precoDeVenda;
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoDeCusto() {
        return precoDeCusto;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Descrição: " + descricao + ", Preço de Custo: " + precoDeCusto +
                ", Preço de Venda: " + precoDeVenda + ", Estoque Disponível: " + estoqueDisponivel;
    }
}
