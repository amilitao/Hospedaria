/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import PacoteClassesSistema.Aluguel;
import PacoteClassesSistema.Cargo;
import PacoteConexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano
 */
public class AluguelDAO {
    
       
     public List<Aluguel> getLista(){
          
        List<Aluguel> aluguel = new ArrayList<Aluguel>();
     PreparedStatement stmt = null;
     
    try(Connection con = new ConnectionFactory().getConnection()){
       con.prepareStatement("select * from aluguel");     
       
        ResultSet rs = stmt.executeQuery();
                
        while(rs.next()){
             Aluguel a = new Aluguel();
             Cargo cargo = new Cargo();
             
             a.setCodAluguel(rs.getString(""));
             //falta implementar outros campos             
                                           
            aluguel.add(a);
            
        } 
        rs.close();
        stmt.close();
        
        return aluguel;
        
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

public void nomeHospede() {
  
  }

public void inserirSaida(String dia, String mes, String ano, String horario){            

}  
                        
  public void registrarEntrada(){		     
                              
    	}//fim de metodo registrar entrada
        
	public void CalculaDiaria(){     
        }   
}
