package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circulo circulo = new Circulo();

        System.out.println("Digite o valor do raio: ");
        circulo.setRaio(sc.nextDouble());

        System.out.println("Valor do raio: " + circulo.getRaio());

        System.out.println("Resultado do Calculo da Area do Circulo: ");
        double area = circulo.CalcularArea();
        System.out.println(area);
    }
}
