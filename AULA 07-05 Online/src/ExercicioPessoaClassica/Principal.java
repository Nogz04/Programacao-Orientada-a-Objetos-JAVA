package ExercicioPessoaClassica;

public class Principal {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Ricardo", 40);
        PessoaJuridica p1 = new PessoaJuridica("Matheus", 20, "46.379.400/0001-50", "Lucas", "07/05/2024");


        System.out.println("\n===============");
        System.out.println("Dados da Pessoa");
        System.out.println("===============");

        p.exibirDados();

        System.out.println("\n========================");
        System.out.println("Dados da Pessoa Juridica");
        System.out.println("========================");

        p1.exibirDados();


    }
}
