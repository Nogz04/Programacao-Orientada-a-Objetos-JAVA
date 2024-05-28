package Ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa("Matheus", 20, "Masculino");
        Pessoa p2 = new Pessoa("Luiza", 22, "Feminino");
        Pessoa p3 = new Pessoa("Gabriela", 18, "Feminino");

        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);

      /* for(Pessoa p : listaPessoas) {  -->Caso queira ver todos os elementos da lista junto com a quantidade de mulheres tire o /*.
           System.out.println("\nNome: " + p.getNome());
           System.out.println("Idade: " + p.getIdade());
           System.out.println("Sexo: " + p.getSexo());
       }*/

        int quantidadeMulheres = contaMulheres(listaPessoas);
        System.out.println("\nQuantidade de Mulheres: " + quantidadeMulheres);
    }

    public static int contaMulheres(List<Pessoa> listaPessoas) {
        int quantidadeMulheres = 0;
        for(Pessoa pessoas : listaPessoas){
            if(pessoas.getSexo().equals("Feminino")){
                quantidadeMulheres++;
            }
        }
        return quantidadeMulheres;
    }
}
