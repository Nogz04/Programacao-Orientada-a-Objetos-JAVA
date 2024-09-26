/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.*;


/**
 *
 * @author mathe
 */
public class Conexao {
    
    //Criando o método para se conectar ao banco de dados.
    public Connection getConexao(){ 
        
        try{
            
            //Instanciando o objeto Connection conn, objeto da biblioteca adicionada aos arquivos do programa e passando o URL através do getConnection.
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaula01?Timezone=true&serverTimezone=UTC", "root", "colocar a senha do seu BD aqui");
            
            System.out.println("Conexão realizada com sucesso!");
            return conn;

            
            
        }catch(Exception e){
            System.out.println("Erro ao conectar-se ao Banco de Dados" +e.getMessage());
            return null;
        }
        
        
        
    }
    
}
