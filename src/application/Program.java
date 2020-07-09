/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import db.DB;
import db.DbIntegrityException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.SQLException;


/**
 *
 * @author c051618
 */
public class Program {
    
    public static void main(String[] args) {
     
        Connection conn = null;
        PreparedStatement st = null;
        
        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
            "DELETE  FROM department "
            +"WHERE "
            +"Id = ?");
            
            st.setInt(1,2); //código 2 do departamento dá erro pq tem vínculo com vendedor
            
            int rowsAffected = st.executeUpdate();
            
            System.out.println("Done: Rows affected: "+rowsAffected);
        }
        catch (SQLException e) {
            throw new DbIntegrityException (e.getMessage());
        }
        
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
    
}
