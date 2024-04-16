package Exercicios;

public class ex3 {
    public static void main(String[] args) {

        String numero = "abc";
        try {
            double valor = Double.parseDouble(numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Erro ao converter String em tipo Double" + " (" + e.getMessage() + ")");
            System.out.println("Erro: Erro ao converter String para Inteiro" + " (" + e.getMessage() + ")");
        }
    }
}
