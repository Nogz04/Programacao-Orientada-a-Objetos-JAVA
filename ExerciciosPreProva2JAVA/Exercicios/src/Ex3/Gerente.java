package Ex3;

public class Gerente extends Funcionario{

    private double bonusPercentual;

   public Gerente(String nome, Double salarioBase, double bonusPercentual){
       super(nome, salarioBase);
       this.bonusPercentual = bonusPercentual;
   }

    @Override
    public double calcularSalario(){
        double bonus = super.calcularSalario()*(this.bonusPercentual/100);
        return super.calcularSalario()+bonus;
    }

    public double getBonusPercentual() {
       return bonusPercentual;
    }

}
