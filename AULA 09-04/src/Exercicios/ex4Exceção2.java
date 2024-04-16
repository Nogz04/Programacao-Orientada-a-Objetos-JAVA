package Exercicios;

public class ex4Exceção2 { //Verificar tamanho de texto em branco (NULO/VAZIO)
    public static void main(String[] args) {
        try {
            String texto = null;
            int tamanho = obterTamanhoTexto(texto);
            System.out.println("Tamanho do texto: " + tamanho);
        } catch (NullPointerException e) { //NullPointerException
            System.out.println("ERRO: Texto em branco " + " // Mensagem do sistema: " + e.getMessage());
        }
    }

    public static int obterTamanhoTexto(String texto) {
        return texto.length(); // Tentativa de acessar o método length(), que verifica o tamanho do texto, porém ele é NULO(vazio)
    }
}
