package Exemplo1;

public class Principal {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.fazerSom();


        animal =  new Cachorro();
        animal.fazerSom();

        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();

        animal = new Passarinho();
        animal.fazerSom();

        animal = new Gato();
        animal.fazerSom();



    }
}
