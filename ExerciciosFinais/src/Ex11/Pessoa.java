package Ex11;

//Não entendi muito bem o inicio do enunciado então fiz como entendi.
//O enunciado começava com "Usando a Pessoa, crie um construtor...etc".

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void ValidarIdade() throws ExcecaoDaIdade {
        if(idade < 0 || idade > 120){
            throw new ExcecaoDaIdade("Idade Inválida! Idade menor que 0 ou maior que 120.");
        }
        else {
            System.out.println("Idade Válida!");
        }
    }
}
