package Ex6;

public class Desenvolvedor extends Funcionario{

    private int horasExtras;
    private double valorHorasExtras;

    public Desenvolvedor(String nome, double salario, double valorHorasExtras) {
        super(nome, salario);
        this.valorHorasExtras = valorHorasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(double valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public void aumentarSalario(double porcentagemFixa, int horasExtras) {
        super.aumentarSalario(porcentagemFixa);
        this.valorHorasExtras = this.valorHorasExtras * horasExtras;
        this.salario = this.salario + this.valorHorasExtras;
    }

    @Override
    public String toString() {
        return super.toString()  + " Valor total em Horas Extras: " + this.valorHorasExtras;
    }
}

