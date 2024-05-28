package Ex9;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();

        Produto p1 = new Produto("Camiseta", 50.00, 2);
        Produto p2 = new Produto("Copo", 20.00, 6);
        Produto p3 = new Produto("Pano de prato", 5.0, 10);

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        for(Produto produto : listaProdutos){
            System.out.println(produto);
        }


    }
}
