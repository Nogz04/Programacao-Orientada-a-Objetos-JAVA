package Ex4;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public void ExibirDetalhes(){
        System.out.println("\nDETALHES DO CARRO: ");
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }


}
