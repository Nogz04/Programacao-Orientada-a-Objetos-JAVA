package Ex2;

public class Circulo {

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double CalcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
