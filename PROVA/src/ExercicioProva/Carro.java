package ExercicioProva;


public class Carro {
	
	private String modelo;
	private String marca;
	
	
	Carro(){
		
	}
	
	
	Carro(String marca){
		this.marca =  marca;
	}
	
	Carro(String marca, String modelo){
		this.marca =  marca;
		this.modelo = modelo;
	}
	
	
	public String getMarca() {
		
		return marca;
	}
	
	public String getModelo() {
		
		return modelo;
		
	}
	
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		 this.modelo = modelo;
	}
	

	
	
	

}



