package ex1;

import java.security.ProtectionDomain;

public class Produto {

    String nome;

    float preco;

    Produto (){

    }

    Produto(String nome){
        this.nome = nome;
    }

    Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;

    }
    public String getNome(String nome){
        return nome;
    }

    public float getPreco(float preco){
        return preco;
    }



}
