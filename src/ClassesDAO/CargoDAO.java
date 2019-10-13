/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesDAO;

import PacoteClassesSistema.Cargo;
import PacoteConexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Adriano
 */
public class CargoDAO {
    
    public List<Cargo> getLista(){
    
        List<Cargo> cargos = new ArrayList<>();      
 
        try(Connection con = new ConnectionFactory().getConnection();
            PreparedStatement stmt = con.prepareStatement("select * from cargo");
            ResultSet rs = stmt.executeQuery(); ) {      
            
            while(rs.next()){            
                Cargo cargo = new Cargo();
                
                cargo.setId(rs.getInt("idCARGO"));
                cargo.setDescricao(rs.getString("descricao"));
                
           cargos.add(cargo);
            
            } 
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro", ex);
        }   
    
    return cargos;
    }
    
}
