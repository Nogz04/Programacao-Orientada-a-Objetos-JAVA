package Ex5;

public class Main {
    public static void main(String[] args) {

        Funcionario vendedor = new Vendedor("André", 5000.00);
        Funcionario gerente = new Gerente("Ricardo", 10000.00);

        vendedor.MostraDados();
        System.out.println("Salário Vendedor: " + vendedor.CalcularSalario());

        gerente.MostraDados();
        System.out.println("Slário do Gerente: " + gerente.CalcularSalario());



    }
}
