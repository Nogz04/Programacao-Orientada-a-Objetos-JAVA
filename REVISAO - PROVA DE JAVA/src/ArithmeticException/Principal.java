package ArithmeticException;

public class Principal{
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("ERRO: ArithmeticException = Erro de divisão por zero\n");
            System.out.println("Mensagem do sistema: " +e.getMessage());
        }


    }
}

//ArithmeticException:
//Lançada quando uma operação aritmética falha, como a divisão por zero.