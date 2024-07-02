package Ex10;

public class BancoDeDados implements AcessoDados{

    @Override
    public void conectar() {
        System.out.println("Conectando-se ao Banco de Dados...");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do Banco de Dados...");
    }

    @Override
    public void inserir() {
        System.out.println("Inserindo dados ao Banco de Dados...");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando dados ao Banco de Dados...");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo dados do Banco de Dados...");
    }

}
