/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import PacoteClassesSistema.Hospede;
import PacoteConexao.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Adriano
 */
public class HospedeDAO {
    
    
  public HospedeDAO(){
    
  }  
    
    
    public void salvar(){
    
   }
   
   public List<Hospede> getLista(){
List<Hospede> hospede = new ArrayList<Hospede>();
     PreparedStatement stmt = null;
     
    try(java.sql.Connection con = new ConnectionFactory().getConnection()){
       con.prepareStatement("select * from hospede");     
       
        ResultSet rs = stmt.executeQuery();
                
        while(rs.next()){
             Hospede h = new Hospede();
                       
             h.setNome(rs.getString("nome"));
             //falta adicionar outros campos
                                                                   
            hospede.add(h);
            
        } 
        rs.close();
        stmt.close();
        
        return hospede;
        
    }catch(SQLException e){
       throw new RuntimeException("Erro no sql",e);    
    }
       
    

}
public void primeiroRegistro(){
            
}
public void anteriorRegistro(){
     
}
public void proximoRegistro(){
     
}
public void ultimoRegistro(){
   
}

public void alterar(){
                

}      
 
 
    
}
