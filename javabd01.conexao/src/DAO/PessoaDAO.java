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
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author mathe
 */
public class PessoaDAO {
    
    //Um objeto da classe Conexao, responsável por estabelecer a conexão com o banco de dados.
    private Conexao conexao;
    
    //Um objeto da interface Connection, que efetivamente mantém a conexão com o banco de dados.
    private Connection conn;
    
    
    //O construtor de PessoaDAO inicializa os objetos conexao e conn.
    public PessoaDAO() {
        this.conexao = new Conexao(); //Cria uma nova instância da classe Conexao, que gerencia a conexão com o banco.
        this.conn = this.conexao.getConexao(); //Chama o método getConexao() da classe Conexao, que retorna a conexão ativa.
                                               // Esse objeto conn será usado para executar comandos SQL.
    }
    //Criando o INSERT INTO do SQL.
    public void inserir(Pessoa pessoa){
        
        String sql = "INSERT INTO pessoa (nome, sexo, idioma) VALUES (?,?,?);";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            //Substituição dos Parâmetros:
            //Aqui os parâmetros ? são preenchidos com os valores correspondentes:
            stmt.setString(1, pessoa.getNome()); //O primeiro parâmetro 1 é substituído por pessoa.getNome().
            stmt.setString(2, pessoa.getSexo()); //O segundo parâmetro 2 é substituído por pessoa.getSexo().
            stmt.setString(3, pessoa.getIdioma()); //O terceiro parâmetro 3 é substituído por pessoa.getIdioma().
            
            stmt.execute(); //Isso executa o comando SQL, inserindo o registro no banco de dados
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa"+ex.getMessage());
        }
        
    }
    
    public Pessoa consulta(int id){
        
        String sql = "SELECT * FROM pessoa WHERE id = ?;";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Pessoa p = new Pessoa();
            
            rs.first();
            p.setId(id);
            p.setId(rs.getInt("id"));
            p.setNome(rs.getString("nome"));
            p.setSexo(rs.getString("sexo"));
            p.setIdioma(rs.getString("idioma"));
            
            return p;
            
        }catch(SQLException ex){
            System.out.println("Erro ao consultar dados da pessoa"+ex.getMessage());
            return null;
        }
    }
     
    
    public void atualizar(Pessoa pessoa){
        
        String sql = "UPDATE pessoa set nome = ?, sexo = ?, idioma = ? WHERE id = ?;";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            stmt.setInt(4, pessoa.getId());
            
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao atualizar os dados da pessoa"+ex.getMessage());
            
        }
    }
    
    
    public void excluir(int id){
        
        try{
            
            String sql = "DELETE FROM pessoa WHERE id = ?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao atualizar os dados da pessoa"+ex.getMessage());
            
        }
        
        
    }
    
   public List<Pessoa> getPessoas(){
       
       String sql = "SELECT * FROM pessoa";
       
       try{
           
           PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
           
           ResultSet rs = stmt.executeQuery();
           List<Pessoa> listaPessoas = new ArrayList();
           
           while (rs.next()){
               Pessoa p = new Pessoa();
               p.setId(rs.getInt("id"));
               p.setNome(rs.getString("nome"));
               p.setSexo(rs.getString("sexo"));
               p.setIdioma(rs.getString("idioma"));
               listaPessoas.add(p);
           }
           return listaPessoas;
           
           
       }catch(SQLException ex){
           System.out.println("Erro ao consultar todas as pessoas: " + ex.getMessage());
           return null;
       }
       
   }
   
   public List<Pessoa> getPessoasNome(String nome, String sexo){
        
        String sql = "SELECT * FROM pessoa WHERE nome LIKE ? and sexo LIKE ?;";
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setString(1, "%"+ nome +"%");
            stmt.setString(2, "%"+ sexo +"%");
            ResultSet rs = stmt.executeQuery();
            List<Pessoa> listaPessoas = new ArrayList();
            
            
            
           while(rs.next()){
                Pessoa p = new Pessoa();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setSexo(rs.getString("sexo"));
                p.setIdioma(rs.getString("idioma"));
                listaPessoas.add(p);
           }  
            return listaPessoas;
            
        }catch(SQLException ex){
            System.out.println("Erro ao consultar todas as pessoas"+ex.getMessage());
            return null;
        }
    }
   
   
    
}
            
            
            
        
            
            
        
        
    

