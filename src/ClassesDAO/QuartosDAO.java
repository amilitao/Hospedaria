/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import PacoteClassesSistema.Cargo;
import PacoteClassesSistema.Funcionario;
import PacoteClassesSistema.Quartos;
import PacoteConexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adriano
 */
public class QuartosDAO {
    
    
    
public void primeiraLinha(){
        
}
public void proximaLinha(){

}        
 public void consultar(){
      
  }
   
   public List<Quartos> getLista(){
 
       List<Quartos> quartos = new ArrayList<Quartos>();
     PreparedStatement stmt = null;
     
    try(Connection con = new ConnectionFactory().getConnection()){
       con.prepareStatement("select * from quartos");     
       
        ResultSet rs = stmt.executeQuery();
                
        while(rs.next()){
             Quartos q = new Quartos();
                        
             q.setNumero(rs.getString(""));
            //falta implementar outros campos
                                           
            quartos.add(q);
            
        } 
        rs.close();
        stmt.close();
        
        return quartos;
        
    }catch(SQLException e){
       throw new RuntimeException("Erro no sql",e);    
    }
              
        
        }
   
  public void descricaoTpQuarto(){
   
  }
    
  public void valorAluguel(){
   
 }
  
 public void atualizaStatus(String numQuarto,String stat){
 
 } 
    
}
