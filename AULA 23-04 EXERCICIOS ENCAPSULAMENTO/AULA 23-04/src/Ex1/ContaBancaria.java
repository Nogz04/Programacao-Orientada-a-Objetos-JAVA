package Ex1;

import static java.lang.System.exit;

public class ContaBancaria {

    private double saldo;
    private double limite;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void saque(double valorSaque) {
        if (valorSaque <= limite) {
            saldo = saldo+valorSaque;
            limite = limite-valorSaque;

            System.out.println("\nVocê sacou: " + valorSaque);
        }else {
            System.out.println("Sem limite!");
            exit(1);
        }
    }


}
