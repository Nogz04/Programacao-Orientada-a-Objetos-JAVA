/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import DAO.PessoaDAO;
import beans.Pessoa;

/**
 *
 * @author mathe
 */
public class JavaBD01 {
    
    public static void main(String[] args) {
        
        //Instanciando a Classe Conexão que contém o método para conectar-se ao Banco de Dados (getConexao()).
        Conexao c = new Conexao(); 
        
        //Chamando o método getConexao() que tem a função de conectar-se ao BD.
        c.getConexao();
        
        Pessoa p = new Pessoa();
        p.setNome("Enzo");
        p.setSexo("M");
        p.setIdioma("Português");
        
        
        PessoaDAO pDAO = new PessoaDAO();
        pDAO.inserir(p);
        
    }
    
}
