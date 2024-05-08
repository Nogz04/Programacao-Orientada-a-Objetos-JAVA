package Ex6;

public class Pessoa {

    private String nome;
    private int idade;
    private String CPF;

    public void setNome(String nome){
        this.nome= nome;
    }

    public void setIdade(int idade){
        this.idade= idade;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCPF(){
        return CPF;
    }

    public void verificarMaiorDeIdade(){
        if(idade>=18){
            System.out.println("A pessoa é MAIOR de idade!");
            System.out.println("IDADE: " +idade);
        }else{
            System.out.println("A pessoa NÃO É MAIOR de idade!");
            System.out.println("IDADE: "+idade);
        }

    }



}
