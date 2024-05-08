package Ex5;

public class Triangulo {

    private int ladoA, ladoB, ladoC;

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void verificaEquilatero(){
        if(ladoA == ladoB && ladoA == ladoC){
            System.out.println("\nO triangulo é EQUILATERO! ");
        }else{
            System.out.println("\nO triangulo NÃO é EQUILATERO! ");
        }
    }

}
