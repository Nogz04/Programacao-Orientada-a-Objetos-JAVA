package Exemplo1Abstract;

public class Cachorro extends Animal {

    public String raca;

    @Override
    public void emiteSom() {
        System.out.println("AU AU");
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Raca: " + raca);
    }

    public void cuidarPatio(){
        System.out.println("O cachorro está cuidando do pátio");
    }
}
