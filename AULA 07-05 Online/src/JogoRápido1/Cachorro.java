package JogoRápido1;

public class Cachorro extends Animal{

    private String raca;

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getRaca(){
        return raca;
    }

    public void latir(){
        System.out.println(som);
    }

}
