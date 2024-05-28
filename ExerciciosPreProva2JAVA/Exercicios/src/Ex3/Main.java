package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       Gerente gerente = new Gerente("Matheus",10000.0, 5.0);//Bonus de 5%

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("SalarioBase: " +gerente.getSalario());
        System.out.println("Salario com Bonus: " + gerente.calcularSalario());



    }
}
