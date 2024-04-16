package ex2;

public class Animal {

    //Atributos

    String nome;

    String especie;

    Animal(){

    }

    Animal(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }

    Animal(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }

}
