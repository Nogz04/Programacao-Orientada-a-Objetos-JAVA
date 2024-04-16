package Part1;

public class AlunoTeste {

    public static void main(String[] args) { //Método main

        //Instanciando o objeto: Aluno
        Aluno aluno1 =  new Aluno();

        //Declarando valores aos atributos:
        aluno1.nome = "Alana Silva";
        aluno1.idade = 21;
        aluno1.curso = "Ciência da Computação";

        aluno1.assistirAula();
        aluno1.fazerProva();
        aluno1.calcularNota();
    }
}
