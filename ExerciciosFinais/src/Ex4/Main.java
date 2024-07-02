package Ex4;

public class Main {
    public static void main(String[] args) {

        Pessoa PJ = new PessoaJuridica("Gabriela", "Santa Maria - RS", "11.234.444/0001-40");
        Pessoa PF = new PessoaFisica("Matheus", "Santa Maria - RS", "064.293.935-80");

        System.out.println("\n=====PESSOA JURIDICA=====");
        PJ.MostrarDados();
        PJ.EfetuarCompra();


        System.out.println("\n=====PESSOA FÍSICA=====");
        PF.MostrarDados();
        PF.EfetuarCompra();
    }
}
