package Arquivos;

import java.io.*;

public class Principal {
    public static void main(String[] args) {

        //Criando objetos Aluno
        Aluno aluno1 = new Aluno("Matheus", 20);
        Aluno aluno2 = new Aluno("Romeo", 19);
        Aluno aluno3 = new Aluno("Vicenzo", 19);

        //Escrevendo os alunos em um arquivo de Texto
        try {
            FileWriter arquivo = new FileWriter("alunos.txt");  //Criando arquivo e selecionando o nome
            BufferedWriter escritor = new BufferedWriter(arquivo); //Intermediando

            //Escrevendo os alunos no arquivo
            escritor.write(aluno1.getNome() + "," + aluno1.getIdade());
            escritor.newLine();

            escritor.write(aluno2.getNome() + "," + aluno2.getIdade());
            escritor.newLine();

            escritor.write(aluno3.getNome() + "," + aluno3.getIdade());
            escritor.newLine();

            escritor.close(); //Fechando
            arquivo.close();


            System.out.println("Arquivos salvos no arquivo alunos.txt\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            FileReader arquivo = new FileReader("alunos.txt"); //Criando leitor de arquivo
            BufferedReader leitor = new BufferedReader(arquivo); //Fazendo a intermediação entre código e arquivo

            System.out.println("Alunos lidos no arquivo: ");

            String linha;

            while((linha = leitor.readLine()) != null){
                String [] campos = linha.split(",");

                String nome = campos[0];
                int idade = Integer.parseInt(campos[1]);

                Aluno aluno = new Aluno(nome,idade);
                System.out.println("Nome: " +aluno.getNome() + ", Idade: " + aluno.getIdade());
            }

            leitor.close();
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
