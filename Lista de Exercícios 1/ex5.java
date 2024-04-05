package ex5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a coordenada x: ");
        double x = teclado.nextDouble();

        System.out.print("Digite a coordenada y: ");
        double y = teclado.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Este ponto está na origem (0,0).");
        } else if (x == 0) {
            System.out.println("Este ponto está sobre o eixo Y.");
        } else if (y == 0) {
            System.out.println("Este ponto está sobre o eixo X.");
        } else if (x > 0 && y > 0) {
            System.out.println("Este ponto está no primeiro quadrante.");
        } else if (x < 0 && y > 0) {
            System.out.println("Este ponto está no segundo quadrante.");
        } else if (x < 0 && y < 0) {
            System.out.println("Este ponto está no terceiro quadrante.");
        } else if (x > 0 && y < 0) {
            System.out.println("Este ponto está no quarto quadrante.");
        }

        teclado.close();
    }

}



