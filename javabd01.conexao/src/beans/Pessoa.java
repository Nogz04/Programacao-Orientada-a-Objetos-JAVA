/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author mathe
 */
public class Pessoa {
    
    //Declarando os atributos que estão no banco de dados conectado, na tabela Pessoa do BD.
    
    private String nome;
    private String sexo;
    private String idioma;

    public Pessoa( String nome, String sexo, String idioma) {
        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
}
