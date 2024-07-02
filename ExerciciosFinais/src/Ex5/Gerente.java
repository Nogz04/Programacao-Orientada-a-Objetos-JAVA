package Ex5;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double CalcularSalario() {
        return salario*=1.20;
    }

    @Override
    public void MostraDados() {
        System.out.println("\n=====DADOS DO GERENTE=====");
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
    }
}
