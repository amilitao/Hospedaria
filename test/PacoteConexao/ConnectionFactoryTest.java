/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adriano
 */
public class ConnectionFactoryTest {
    
    public ConnectionFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getConnection method, of class ConnectionFactory.
     */
    @Test
    public void testGetConnection() {
        String sql = "select * from cargo";
       Connection con = new ConnectionFactory().getConnection();
              
       try {
            PreparedStatement stmt = con.prepareStatement(sql);
        
            
           // System.out.println(rs.getString("idCARGO"));
            stmt.close();
        } catch (SQLException ex) {
            throw new RuntimeException("erroooo",ex);
        }
       
       
       
    }
    
}
