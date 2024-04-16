package MatrizTreino;

import java.util.Random;

public class Matriz {
    private int [][] matriz =  new int[3][3];

    //Construtor para gerar matriz
    Matriz(){
        Random rand =  new Random();
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                matriz[i][j] = rand.nextInt(10);
            }
        }

    }

    public void gerarMatriz(){
        for (int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int somaDiagonal(){
        int soma = 0;
        for (int i = 0; i<3; i++){
            soma+=matriz[i][i];
        }

        System.out.println("\nSOMA DA DIAGONAL = " + soma);
        return soma;
    }

    public void setMatriz(int [][] matriz){
        this.matriz = matriz;
    }

    public int[][] getMatriz(){
        return matriz;
    }


}
