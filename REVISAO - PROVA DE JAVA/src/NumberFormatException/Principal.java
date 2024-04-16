package NumberFormatException;

public class Principal {
    public static void main(String[] args) {

        String numero = "ABC";

        try {
            int valor = Integer.parseInt(numero);
        }catch (NumberFormatException e){
            System.out.println("ERRO: NumberFormatException = Não foi possivel converter a String em um numero válido.\n");
            System.out.println("Mensagem do Sistema: " + e.getMessage());
        }

    }
}

//NumberFormatException:
//Lançada quando uma string não pode ser convertida em um número válido.