package Ex6;

public class Gerente extends Funcionario{

    private double bonusAnual;

    public Gerente (String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public void aumentarSalario(double porcentagemFixa, double porcentagemAdicional) {
        super.aumentarSalario(porcentagemFixa);
        this.salario += this.salario * (porcentagemAdicional / 100);
        this.salario = this.salario + this.bonusAnual;
    }

    @Override
    public String toString() {
        return super.toString() + " Bonus Anual: " + bonusAnual;
    }
}

//120 = 4120 = 4320 + 5000