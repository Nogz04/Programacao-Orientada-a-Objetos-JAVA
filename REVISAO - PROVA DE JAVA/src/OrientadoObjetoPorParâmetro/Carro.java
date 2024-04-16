package OrientadoObjetoPorParâmetro;

public class Carro {

    //ATRIBUTOS
    String nome;
    String marca;
    int ano;
    int vel; //velocidade do carro

    //MÉTODOS
    void acelerar(int aceleracao){
        vel+=aceleracao;
    }

    void freiar(int reduzir){
        vel-=reduzir;
    }

    void buzinar(){
        System.out.println("bi-bi-biii");
    }

}
