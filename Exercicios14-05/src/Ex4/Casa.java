package Ex4;

public class Casa {

    private static final double preco_base_por_metro_quadrado = 1000.0;

    public double calcularPreco(int tamanho) {
        return tamanho * preco_base_por_metro_quadrado;
    }


    public double calcularPreco(int tamanho, int numQuartos) {

        double precoPorQuarto = 10000.0;

        double precoBase = tamanho * preco_base_por_metro_quadrado;

        double precoTotal = precoBase + (numQuartos * precoPorQuarto);

        return precoTotal;
    }
}