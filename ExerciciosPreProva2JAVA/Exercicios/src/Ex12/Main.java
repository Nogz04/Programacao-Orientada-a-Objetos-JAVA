package Ex12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Livro> listaLivros = new ArrayList<Livro>();

        Livro l1 = new Livro("O Senhor dos Anéis: A Sociedade do Anel", " J.R.R. Tolkien", 1954); //2
        Livro l2 = new Livro("O pequeno príncipe", "Antoine de Saint-Exupéry", 1943); //1
        Livro l3 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967); //3

        listaLivros.add(l1);
        listaLivros.add(l2);
        listaLivros.add(l3);

        listaLivros.sort(new Comparator<Livro>() {
            public int compare(Livro l1, Livro l2) {
                return Integer.compare(l1.getAno(), l2.getAno());
            }

        });

        for(Livro livro : listaLivros) {
            System.out.println(livro);
        }

        System.out.println("\nDatas Ordenadas por lançamento:");
        for(Livro livro : listaLivros) {
            System.out.println(livro.getAno());
        }
    }
}
