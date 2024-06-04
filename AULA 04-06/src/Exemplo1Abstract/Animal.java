package Exemplo1Abstract;

public abstract class Animal {

    public String nome;
    public int idade;

    public abstract void emiteSom();

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }


}
