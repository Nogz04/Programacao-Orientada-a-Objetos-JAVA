package OrientadoObjetoModAcessoEgetSet;
//MODIFICADORES DE ACESSO = GET E SET

//private: somente a classe onde foi declarado o private pode manipular o atributo.
public class Aluno {

    //ATRIBUTOS
    private String nome;
    private int idade;

    public void setNome(String nome){ // MÉTODO set para DEFINIR o nome.
        this.nome = nome;

    }

    public String getNome(){ //MÉTODO get para EXIBIR o nome.
        return nome;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 130) {
            this.idade = idade;
            System.out.printf("Idade Cadastrada");
        }
        else {
            System.out.println("ERRO! Idade inválida.");
        }


    }
}


