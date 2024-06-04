package Exemplo1Interface;

public class Main {
    public static void main(String[] args) {

        Animal cachorro = new Cachorro("Tobi", 5);
        cachorro.emitirSom();
        cachorro.exibirDados();


        Cachorro cachorro2 = new Cachorro("Husky", 10);
        System.out.println();
        cachorro2.cuidarPatio();
        cachorro2.exibirDados();

        Animal gato = new Gato("Frajola", 12);
        System.out.println();
        gato.emitirSom();
        gato.exibirDados();





    }
}
