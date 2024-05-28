package Ex13;

public class Conta {

    private String titular;
    private String numero;
    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        if (numero == null || titular == null) {
            throw new IllegalArgumentException("Número e titular da conta não podem ser nulos.");
        }
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
