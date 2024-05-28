package Ex13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Conta> listaContas = new ArrayList<>();

        Conta c1 =  new Conta("1111111", "Matheus", 5000.0);
        Conta c2 =  new Conta("2222222", "Lucas", 6000.0);
        Conta c3 =  new Conta("3333333", "Gabriela", 9000.0);

        listaContas.add(c1);
        listaContas.add(c2);
        listaContas.add(c3);

        Conta contaMaiorSaldo = encontrarContaMaiorSaldo(listaContas);

        // Imprimindo os dados da conta com o maior saldo
        if (contaMaiorSaldo != null) {
            System.out.println("Conta com o maior saldo:");
            System.out.println(contaMaiorSaldo);
        } else {
            System.out.println("A lista de contas está vazia.");
        }
    }

    public static Conta encontrarContaMaiorSaldo(List<Conta> listaContas) {
        if (listaContas.isEmpty()) {
            return null;
        }

        Conta contaMaiorSaldo = listaContas.getFirst();
        for (Conta conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        return contaMaiorSaldo;
    }
}
