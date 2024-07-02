package Ex13;

public class Main {
    public static void main(String[] args) {

        //Triangulo válido
        System.out.println("\n=====Teste do triangulo válido=====\n");
        try {
            Triangulo triangulo = new Triangulo(4, 4, 4);
            System.out.println("Triângulo válido: " + triangulo.getLado1() + ", " + triangulo.getLado2() + ", " + triangulo.getLado3());
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }


        //Idade invalida
        System.out.println("\n=====Teste do triangulo inválido=====\n");
        try {
            Triangulo trianguloInvalido = new Triangulo(1, 2, 3);
            System.out.println("Triângulo inválido: " + trianguloInvalido.getLado1() + ", " + trianguloInvalido.getLado2() + ", " + trianguloInvalido.getLado3());
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }


    }
}
