package Ex11;

public class Main {
    public static void main(String[] args) throws ExcecaoDaIdade {

        //Idade Válida
        try {
            Pessoa p = new Pessoa("Matheus", 20);
            Pessoa p2 = new Pessoa("Maria", 19);
            Pessoa p3 = new Pessoa("Arthur", 121);

            System.out.println("\n=====VERIFICANDO VALIDAÇÕES=====");

            System.out.println("\n     =====IDADES VÁLIDAS=====\n");

            System.out.println("PESSOA 1:");
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
            p.ValidarIdade();

            System.out.println("\nPESSOA 2:");
            System.out.println("Nome: " + p2.getNome());
            System.out.println("Idade: " + p2.getIdade());
            p2.ValidarIdade();


            //Teste de idade inválida.

            System.out.println("\n     =====IDADE INVÁLIDA=====\n");
            System.out.println("PESSOA 3:");
            System.out.println("Nome: " + p3.getNome());
            System.out.println("Idade: " + p3.getIdade());
            p3.ValidarIdade();
        }catch (ExcecaoDaIdade e){
            System.out.println("ERRO: " +e.getMessage());
        }
    }
}
