package Ex4;

public class PessoaJuridica extends Pessoa{

    private String CNPJ;

    public PessoaJuridica(String nome, String cidade, String CNPJ) {
        super(nome, cidade);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    @Override
    public void EfetuarCompra() {
        System.out.println("Compra Efetuada com sucesso! --> Pessoa juridica");
    }

    @Override
    public void MostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cidade: " + getCidade());
        System.out.println("CNPJ: " + getCNPJ());
    }
}


