package Ex5;

public class Cliente {

    private String nome;
    private double desconto;

    public Cliente(String nome, double desconto){
        this.nome = nome;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getDesconto() {
        return desconto;
    }

}
