package Ex4;

public abstract class Pessoa {

    protected String nome;
    protected String cidade;

    public Pessoa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public abstract void EfetuarCompra();
    public abstract void MostrarDados();


}
