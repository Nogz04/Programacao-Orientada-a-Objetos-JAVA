package Ex2;

public class Principal {
    public static void main(String[] args) {

        System.out.println("===== CONTA CORRENTE =====");

        ContaCorrente cc = new ContaCorrente(1000, 3000);
        System.out.println("Saldo inicial: " + cc.getSaldo());

        cc.depositar(100);
        System.out.println("Saldo atual: " + cc.getSaldo());

        cc.sacar(50);
        System.out.println("Saldo atual: " + cc.getSaldo());


        System.out.println("\n===== CONTA POUPANÇA =====");

        ContaPoupanca cp = new ContaPoupanca(1000, 3000);
        System.out.println("Saldo inicial: " + cp.getSaldo());

        cp.depositar(100);
        System.out.println("Saldo atual: " + cp.getSaldo());

        cp.sacar(50);
        System.out.println("Saldo atual: " + cp.getSaldo());

        System.out.println("\"Juros de 3% aplicados. Saldo atual: R$" +cp.atualizaJuros());


        System.out.println("\n===== CONTA INVESTIMENTO =====");

        ContaInvestimento ci = new ContaInvestimento(1000, 3000);
        System.out.println("Saldo inicial: " + ci.getSaldo());

        ci.depositar(100);
        System.out.println("Saldo atual: " + ci.getSaldo());

        ci.sacar(50);
        System.out.println("Saldo atual: " + ci.getSaldo());

        System.out.println("Rendimentos de 5% aplicados. Saldo atual: R$" +ci.atualizaRendimentos());
    }
}
