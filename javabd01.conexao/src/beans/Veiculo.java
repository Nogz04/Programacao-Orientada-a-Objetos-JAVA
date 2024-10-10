/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author laboratorio
 */
public class Veiculo {
    
    private int id;
    private String modelo;
    private String placa;
    private Pessoa pessoaid;

    public Veiculo(String modelo, String placa, Pessoa pessoaid) {
        this.modelo = modelo;
        this.placa = placa;
        this.pessoaid = pessoaid;
    }

    public Veiculo(){
        
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Pessoa getPessoaid() {
        return pessoaid;
    }

    public void setPessoaid(Pessoa pessoaid) {
        this.pessoaid = pessoaid;
    }
    
    
    
}
