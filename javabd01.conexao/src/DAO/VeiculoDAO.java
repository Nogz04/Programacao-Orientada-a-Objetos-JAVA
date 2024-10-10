/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import beans.Pessoa;
import beans.Veiculo;
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
 * @author laboratorio
 */
public class VeiculoDAO {
    
    private Conexao conexao;
    private Connection conn;
    
    public VeiculoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
     public void inserir(Veiculo veiculo){
        
        String sql = "INSERT INTO veiculo (modelo, placa, id_pessoa) VALUES (?,?,?);";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            //Substituição dos Parâmetros:
            //Aqui os parâmetros ? são preenchidos com os valores correspondentes:
            stmt.setString(1, veiculo.getModelo()); //O primeiro parâmetro 1 é substituído por pessoa.getNome().
            stmt.setString(2, veiculo.getPlaca()); //O segundo parâmetro 2 é substituído por pessoa.getSexo().
            stmt.setInt(3, veiculo.getPessoaid().getId()); //O terceiro parâmetro 3 é substituído por pessoa.getIdioma().
            
            stmt.execute(); //Isso executa o comando SQL, inserindo o registro no banco de dados
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir Veiculo"+ex.getMessage());
        }
        
    }
     
     public Veiculo consulta(int id){
        
        String sql = "SELECT * FROM veiculo WHERE id = ?;";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Veiculo v = new Veiculo();
            
            rs.first();
            v.setId(id);
            v.setId(rs.getInt("id"));
            v.setModelo(rs.getString("modelo"));
            v.setPlaca(rs.getString("placa"));

            int idPessoa = rs.getInt("id_pessoa");
            PessoaDAO pDAO = new PessoaDAO();
            Pessoa p = pDAO.consulta(idPessoa);
            v.setPessoaid(p);
            
            return v;
            
        }catch(SQLException ex){
            System.out.println("Erro ao consultar dados do veiculo"+ex.getMessage());
            return null;
        }
    }
     
    public void atualizar(Veiculo veiculo){
        
        String sql = "UPDATE veiculo set modelo = ?, placa = ?, id_pessoa = ? WHERE id = ?;";
        //O INSERT INTO insere um novo registro na tabela pessoa, 
        //onde os valores para as colunas nome, sexo e idioma serão fornecidos por parâmetros (?,?,?).
        
        try {
            
            // O objeto PreparedStatement permite que você substitua os '?' no SQL com valores reais.
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getPlaca());
            stmt.setInt(3, veiculo.getPessoaid().getId());
            stmt.setInt(4, veiculo.getId());
            
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao atualizar os dados do veiculo"+ex.getMessage());
            
        }
    }
    
    
    public void excluir(int id){
        
        try{
            
            String sql = "DELETE FROM veiculo WHERE id = ?;";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            
            
        }catch(SQLException ex){
            System.out.println("Erro ao excluir veiculo: "+ex.getMessage());
            
        }
        
        
    }
    
}
