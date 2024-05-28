package Ex4;

public class ContaBancaria {

    private double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }


    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.println("\nDeposito de " +valor+ " realizado com sucesso!");
            System.out.println("SALDO: "+this.saldo);
        }else{
            System.out.println("Valor de depósito invalido!");
        }
    }

    public void depositar(Cheque cheque){
        double valor = cheque.getValor();
        if(valor>0){
            this.saldo += valor;
            System.out.println("\nCheque depositado no valor de: " +valor);
            System.out.println("SALDO: "+this.saldo);
        }else{
            System.out.println("Valor de cheque invalido!");
        }
    }

}
