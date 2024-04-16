package ExercicioProva;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		
		Scanner teclado =  new Scanner(System.in);
		
		String marca;
		String modelo;
		int opcao = 10;
		Carro c1 = null;
		while(opcao != 0) {
			System.out.println("\nMENU");
			System.out.println("\n1 - Criar um carro informando a marca");
			System.out.println("2 - Criar um carro informando a marca e modelo");
			System.out.println("3 - Exibir informacoes do carro");
			System.out.println("4 - Atribuir modelo do carro");
			System.out.println("5 - Obter modelo do carro");
			System.out.println("6 - Atribuir marca do carro");
			System.out.println("7 - Obter marca do carro");
			System.out.println("0 - SAIR");
			System.out.println("Escolha sua opcao: ");
			opcao =  teclado.nextInt();
		
		
		teclado.nextLine(); //LIMPAR BUFFER
		
		if(opcao == 1) {
			System.out.println("Informe a marca do carro: ");
			 marca = teclado.nextLine();
				
			c1 = new Carro(marca);
			System.out.println("\nMARCA: ");
			System.out.println(c1.getMarca()); 
			
			
		}
		else if (opcao == 2) {
			System.out.println("Informe a marca do carro: ");
			marca = teclado.nextLine();
				
			System.out.println("Informe o modelo do carro: ");
			modelo = teclado.nextLine();
				
			c1 = new Carro(marca, modelo);
			System.out.println("\nMARCA: ");
			System.out.println(c1.getMarca());
			System.out.println("\nMODELO: ");
			System.out.println(c1.getModelo());
		}else if (opcao == 3) {
				
			
			System.out.println("MARCA: ");
			System.out.println(c1.getMarca());
			System.out.println("\nMODELO: ");
			System.out.println(c1.getModelo());
		}else if (opcao == 4) {
			System.out.println("Informe o modelo do carro: ");
			modelo =  teclado.nextLine();
			c1.setModelo(modelo);
		}
		else if (opcao == 5) {
			System.out.println("\nModelo do carro: ");
			System.out.println(c1.getModelo());
		}
		else if (opcao == 6) {
			System.out.println("Informe o modelo do carro: ");
			marca =  teclado.nextLine();
			c1.setMarca(marca);
		}
		else if (opcao == 7) {
			System.out.println("\nMarca do carro: ");
			System.out.println(c1.getMarca());
		}
			
		}
	}

	}
