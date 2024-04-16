package OrientadoObjetoConstrutores;

public class Produto {

    //ATRIBUTOS
    String nome;
    String marca;
    float valor;

    //CONSTRUTORES

    //Construtor PADRÃO
    Produto(){

    }

    //Construtor de UM PARÂMETRO
    Produto(String nome){
        this.nome = nome; // o this.nome = nome; define que o ATRIBUTO nome é IGUAL ao nome
                          // recebido por PARÂMETRO.
    }

    //Construtor de DOIS PARÂMETROS
    Produto(String nome, String marca){
        this.nome =  nome;
        this.marca = marca;
    }

    //Construtor de TRÊS PARÂMETROS
    Produto (String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }

}
