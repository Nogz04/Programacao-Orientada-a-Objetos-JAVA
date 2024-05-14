package Ex1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o valor de X e depois o de Y: ");
        triangulo.calcularArea(sc.nextInt(), sc.nextInt());


    }
}
