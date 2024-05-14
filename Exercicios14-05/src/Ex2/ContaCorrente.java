package Ex2;

public class ContaCorrente extends ContaBancaria{



    @Override
    public void calcularSaldo(float saldo, float saque, float deposito ) {
        super.calcularSaldo(saldo, saque, deposito);
        saldo = saldo-saque+deposito;
        System.out.println("Saldo: " +saldo);
    }
}
