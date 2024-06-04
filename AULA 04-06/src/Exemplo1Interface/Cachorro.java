package Exemplo1Interface;

public class Cachorro implements Animal {

    private String nome;
    private int idade;

    Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Au au ");
    }

    public void cuidarPatio(){
        System.out.println("O cachorro está cuidando do pátio");
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
