package Ex4;

public class PessoaFisica extends Pessoa{

    private String CPF;

    public PessoaFisica(String nome, String cidade, String CPF) {
        super(nome, cidade);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public void EfetuarCompra() {
        System.out.println("Compra efetuada com sucesso! --> Pessoa física");
    }

    @Override
    public void MostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("CPF: " + getCPF());
    }
}
