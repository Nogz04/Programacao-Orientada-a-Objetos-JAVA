package Ex5;

public class Main {
    public static void main(String[] args) {


        Produto produto = new Produto("Garrafa de agua", 15.00);
        Cliente cliente = new Cliente("Matheus", 5.0);


        System.out.println("\nPRODUTO");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());

        System.out.println();

        System.out.println("CLIENTE: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Desconto: " + cliente.getDesconto()+"%");
        System.out.println("Preço final do produto com desconto: " + produto.calcularPrecoFinal(cliente));


    }
}
