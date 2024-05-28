package Ex10;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("Matheus", 10.0, 9.0);
        Aluno aluno2 = new Aluno("Joao", 5.0, 5.0);
        Aluno aluno3 = new Aluno("Juliana", 9.0, 9.0);

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);



        for(Aluno alunos : listaAlunos){
            double media = (alunos.getNota1() + alunos.getNota2())/2;
            if(media >= 6){
                System.out.println("\nAluno: " + alunos.getNome());
                System.out.println("Status: Aprovado!");
            }else{
                System.out.println("\nAluno: " + alunos.getNome());
                System.out.println("Status: Reprovado!");
            }
        }

    }
}
