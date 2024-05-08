package Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o valor do lado A do triangulo: ");
        triangulo.setLadoA(sc.nextInt());

        System.out.println("Digite o valor do lado B do triangulo: ");
        triangulo.setLadoB(sc.nextInt());

        System.out.println("Digite o valor do lado C do triangulo: ");
        triangulo.setLadoC(sc.nextInt());

        triangulo.verificaEquilatero();
    }
}
