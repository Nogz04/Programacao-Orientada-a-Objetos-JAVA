package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Retangulo r1 = new Retangulo();

        System.out.println("\nDigite o valor da base: ");
        r1.setBase(sc.nextFloat());

        System.out.println("\nDigite o valor da altura: ");
        r1.setAltura(sc.nextFloat());


        System.out.println("\nVALOR DA AREA:");
        float area = r1.CalcularArea();
        System.out.println(area);


    }
}
