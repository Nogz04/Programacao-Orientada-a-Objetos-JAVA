package Exercicios;

public class ex4Exceção1 { //Divisão por 0
    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){ //ArithmeticException
            System.out.println("ERRO: Divisão por 0" + " // Mensagem do Sistema: ("+e.getMessage()+")");
        }

    }
}
