/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import PacoteClassesSistema.Funcionario;
import PacoteClassesSistema.Hospede;
import PacoteClassesSistema.Reserva;
import PacoteConexao.ConnectionFactory;
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
public class ReservaDAO {
    
    public List<Reserva> getLista(){
       List<Reserva> reservas = new ArrayList<Reserva>();
     PreparedStatement stmt = null;
     
    try(java.sql.Connection con = new ConnectionFactory().getConnection()){
       con.prepareStatement("select * from reserva");     
       
        ResultSet rs = stmt.executeQuery();
                
        while(rs.next()){
             Reserva r = new Reserva();
                       
             r.setId(rs.getString(""));
             //falta adicionar outros campos
                                                                   
            reservas.add(r);
            
        } 
        rs.close();
        stmt.close();
        
        return reservas;
        
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

public void alterarDados(){
                

}      
        
 public void cadastrar(){
                                  
                
 }  
}
