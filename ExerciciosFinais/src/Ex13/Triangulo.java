package Ex13;

public class Triangulo {

    protected int lado1, lado2, lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        validarTriangulo();
    }

    public void validarTriangulo() throws IllegalArgumentException {
        if (lado1 <=0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Os valores dos lados do triangulo devem ser maiores que 0.");
        }
        else if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Os valores informados não formam um triangulo");
        }
        else{
            System.out.println("O Triangulo é Válido!");
        }
    }

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }

}
