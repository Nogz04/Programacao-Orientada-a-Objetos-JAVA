package Ex1;

public class Computador {

    protected String marca;
    private String modelo;

    public Computador(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String exibeModelo() {
        return modelo = "Portatil";
    }
}
