package ListaComArquivos;

import Arquivos.Aluno;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //Criando objetos Aluno

        Aluno aluno1 = new Aluno("Romeo", 19);
        Aluno aluno2 = new Aluno("Vicenzo", 19);
        Aluno aluno3 = new Aluno("Antony", 19);
        List<Aluno> lista = new ArrayList<>();

        Arquivo arquivo = new Arquivo("alunos");
        arquivo.gravaArquivo(aluno1);
        arquivo.gravaArquivo(aluno2);
        arquivo.gravaArquivo(aluno3);

        lista = arquivo.leArquivo();

        for (Aluno a : lista){
            System.out.println("Nome: " +a.getNome() + ", Idade: " + a.getIdade());
        }
    }
}
