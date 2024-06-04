package Exemplo2Abstract;

public class Principal {
    public static void main(String[] args) {


        Retangulo retangulo = new Retangulo(2,2);
        Circulo circulo = new Circulo(10);

        System.out.printf("Area do Retângulo: " +retangulo.area());
        System.out.println("\nPerimetro do Retângulo: " +retangulo.perimetro());

        System.out.printf("\nArea do Circulo: " +circulo.area());
        System.out.println("\nPerimetro do Circulo: " +circulo.perimetro());

    }
}
