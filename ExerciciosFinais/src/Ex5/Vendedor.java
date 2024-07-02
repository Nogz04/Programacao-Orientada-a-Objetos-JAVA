package Ex5;

public class Vendedor extends Funcionario{

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double CalcularSalario() {
        return salario;
    }

    @Override
    public void MostraDados() {
        System.out.println("\n=====DADOS DO VENDEDOR=====");
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
    }
}
