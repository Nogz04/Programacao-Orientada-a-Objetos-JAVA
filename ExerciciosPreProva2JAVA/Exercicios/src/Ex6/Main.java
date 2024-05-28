package Ex6;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[3];

        Gerente gerente = new Gerente("Matheus", 4000.0, 5000.0);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Lucas", 2000.0, 45.0);
        Desenvolvedor desenvolvedor2 = new Desenvolvedor("Michelle", 2000.0, 45.0);

        funcionarios[0] = gerente;
        funcionarios[1] = desenvolvedor1;
        funcionarios[2] = desenvolvedor2;


        //Informações dos funcionarios antes do aumento
        System.out.println("Antes do Aumento");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        gerente.aumentarSalario(3.0, 5.0);
        desenvolvedor1.aumentarSalario(3.0, 16);
        desenvolvedor2.aumentarSalario(3.0, 18);

        System.out.println("\nDepois do aumento");
        //Informações dos funcionarios depois do aumento
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }
}

