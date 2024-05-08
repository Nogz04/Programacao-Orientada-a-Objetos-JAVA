package JogoRápido1;

public class Animal {

    protected String nome;
    protected int idade;
    protected String som;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getSom() {
        return som;
    }
}
