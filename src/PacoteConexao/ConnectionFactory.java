/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Adriano
 */
public class ConnectionFactory {
   
    
    public Connection getConnection(){
   
        try{Connection conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost/banco_hospedaria", "root", "root");
             
            return conexao;
            
        } catch (SQLException ex) {
           throw new RuntimeException("Erro na criação da conexao",ex);   
        }       
    }   
}
