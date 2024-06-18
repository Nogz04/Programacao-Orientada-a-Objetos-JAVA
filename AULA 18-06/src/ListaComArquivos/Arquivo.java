package ListaComArquivos;

import Arquivos.Aluno;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Arquivo {

    private FileWriter arqWriter;
    private BufferedWriter escritor;
    private FileReader arqReader;
    private BufferedReader leitor;
    public String nomeArquivo;

    private List<Aluno> listAlunos;

    public Arquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        listAlunos = new ArrayList<>();
    }

    public void gravaArquivo(Aluno a){
        //Escrevendo os alunos em um arquivo de texto
        try{
            //Escrevendo os alunos no arquivo
            arqWriter = new FileWriter(nomeArquivo+".txt", true);
            escritor =  new BufferedWriter(arqWriter);
            escritor.write(a.getNome() + "," + a.getIdade());
            escritor.newLine();
            escritor.close();
            arqWriter.close();

            System.out.println("Alunos salvos no arquivo alunos.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> leArquivo(){
        //Lend os alunos no Arquivo
        System.out.println("Alunos lidos no arquivo:");
        try{
            arqReader = new FileReader(nomeArquivo+".txt");
            leitor = new BufferedReader(arqReader);
            String linha;
            while ((linha = leitor.readLine()) != null){
                String[] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);
                Aluno aluno = new Aluno(nome,idade);
                listAlunos.add(aluno);
            }

            leitor.close();
            arqReader.close();

            }catch (IOException e){
                e.printStackTrace();
        }

        return listAlunos;
    }


}
