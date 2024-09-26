/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Pessoa;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathe
 */
public class PessoaDAO {
    
    //Criando objeto conexao da Classe Conexao.
    private Conexao conexao;
    
    //Criando objeto conn igual ao que está na classe Conexao.
    //conn é o objeto responsável pela conexão, por se conectar-se ao BD.
    private Connection conn;
    
    
    //Construtor do PessoaDAO
    public PessoaDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao(); //esse 'conn' é = ao método que está na classe Conexao.
    }
    
    //Criando o INSERT INTO do SQL.
    public void inserir(Pessoa pessoa){
        
        String sql = "INSERT INTO pessoa (nome, sexo, idioma) VALUES (?,?,?);";
        
        try {
            
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            
            stmt.execute();
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa"+ex.getMessage());
        }
        
    }
}
