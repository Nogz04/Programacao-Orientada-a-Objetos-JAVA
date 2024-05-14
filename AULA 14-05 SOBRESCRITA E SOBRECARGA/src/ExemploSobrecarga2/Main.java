package ExemploSobrecarga2;

public class Main {
    public static void main(String[] args) {

        Multiplicar multiplicar = new Multiplicar();

        int resultado1 = multiplicar.multiplica(1,2);

        double resultado2 = multiplicar.multiplica(1.1, 2.1);

        System.out.println("Resultado1: " +resultado1);
        System.out.println("Resultado2: " +resultado2);
    }
}
