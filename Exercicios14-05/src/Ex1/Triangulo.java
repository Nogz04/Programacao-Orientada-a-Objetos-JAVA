package Ex1;

public class Triangulo extends FormaGeometrica{

    @Override
    public void calcularArea(int x, int y) {
        super.calcularArea(x,y);
        System.out.println("Resultado: " + x*y);
    }
}
