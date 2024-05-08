package ExercicioPessoaClassica;

public class PessoaJuridica extends Pessoa {

    protected String CNPJ;
    protected String socio;
    protected String dtAbertura;

    public PessoaJuridica(String nome, int idade, String CNPJ, String socio, String dtAbertura) {
        super(nome, idade); //Chamando o construtor da SUPER CLASSE, no caso, a classe herdada (Pessoa)
        //tem que ter nome e dadade no construtor, pois é da classe pai
        this.CNPJ = CNPJ;
        this.socio = socio;
        this.dtAbertura = dtAbertura;

    }

    public void exibirDados(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("CNPJ: " +this.CNPJ);
        System.out.println("Socio: " +this.socio);
        System.out.println("DtAbertura: " +this.dtAbertura);
    }


}
