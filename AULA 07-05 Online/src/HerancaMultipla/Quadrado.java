package HerancaMultipla;

public class Quadrado extends Desenho2D{

    protected String desc;

    public Quadrado(String nomeAutor, int largura, int altura, String desc) {
        super(nomeAutor, altura, largura);
        this.desc = desc;
    }

    public void exibeDados(){
        System.out.println("Largura: " +this.largura);
        System.out.println("Altura: " +this.altura);
        System.out.println("Desc: " +this.desc);
        System.out.println("Autor: " +this.nomeAutor);
    }
}
