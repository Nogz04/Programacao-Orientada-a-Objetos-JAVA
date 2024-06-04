package Exemplo1Abstract;

public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Caramelo";
        cachorro.idade = 12;
        cachorro.raca = "Vira-lata";
        cachorro.mostrarDados();
        cachorro.emiteSom();
        cachorro.cuidarPatio();

    }
}
