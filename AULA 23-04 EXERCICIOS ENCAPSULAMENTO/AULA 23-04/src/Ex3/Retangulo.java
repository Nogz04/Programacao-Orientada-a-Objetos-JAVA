package Ex3;

public class Retangulo {

    private float base;
    private float altura;

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float CalcularArea() {
        return (base*altura);
    }

}
