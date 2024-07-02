package Ex10;

public class Main {
    public static void main(String[] args) {

        BancoDeDados BD = new BancoDeDados();

        System.out.println("\n=====OPERAÇÕES NO BANCO DE DADOS======");

        BD.conectar();
        BD.inserir();
        BD.atualizar();
        BD.excluir();
        BD.desconectar();

    }
}
