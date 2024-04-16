package Matrizes;

import java.util.Random;

public class Matriz {

    private int[][] matriz;

    // Método construtor para inicializar a matriz 3x3 e preenchê-la com valores aleatórios
    public Matriz() {
        matriz = new int[3][3];
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(10); // valores aleatórios de 0 a 9
            }
        }
    }

    // Método para imprimir a matriz
    public void imprimirMatriz() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular e retornar a soma da diagonal principal
    public int somaDiagonalPrincipal() {
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    // Métodos getters e setters
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int[][] getMatriz() {
        return matriz;
    }

}

