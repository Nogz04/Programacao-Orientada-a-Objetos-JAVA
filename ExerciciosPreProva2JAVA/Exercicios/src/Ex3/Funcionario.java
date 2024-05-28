package Ex3;

public class Funcionario {

    private double salarioBase;
    private String nome;

    public Funcionario(String nome, double salarioBase) {
        this.salarioBase = salarioBase;
        this.nome = nome;

    }

    public double calcularSalario(){
        return this.salarioBase;
    }

    public double getSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
