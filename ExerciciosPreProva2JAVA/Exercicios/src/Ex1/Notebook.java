package Ex1;

import java.util.Scanner;

public class Notebook extends Computador {

    private static String marca;

    public Notebook (String marca){
        super(marca);
        Notebook.marca = marca;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Computador c1 = new Computador(marca);
        System.out.println("Digite a marca: ");
        c1.setMarca(sc.next());

        exibeMarca(c1);
        System.out.println("Modelo: " + c1.exibeModelo());
    }

    public static void exibeMarca(Computador c){
        System.out.println("Marca: " + c.getMarca());
    }
}




