package Ex12;


public class Main {
    public static void main(String[] args) throws ExcecaoDataInvalida {

        //Data Válida
        System.out.println("\n=====TESTE DA DATA VALIDA=====");
        try {
            Data data = new Data(30, 4, 2004);
            data.ExibirData();
        }catch (IllegalArgumentException e){
            System.out.println("ERRO: " +e.getMessage());
        }

        //Teste data inválida
        System.out.println("\n=====TESTE DA DATA INVÁLIDA=====\n");
        try {
            Data data1 = new Data(30, 2, 2004);
            data1.ExibirData();
        }catch (IllegalArgumentException e){
            System.out.println("ERRO: " +e.getMessage());
        }

    }
}
