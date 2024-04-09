/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author john
 */
public class DAO {

    protected Connection con;
    protected Statement stm;
    protected ResultSet rst;
    final String driver = "com.mysql.jdbc.Driver";
    final String user = "root";
    final String password = "root";
    final String database = "colegio";

    public void conectDB() throws Exception {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio", user, password);
        } catch (SQLException e) {
            throw e;
        }

    }
    public void desconectDB()throws Exception {
        try {
         if(stm != null){
             stm.close();
         }   
         if(con != null){
             con.close();
         }
         if(rst != null){
             rst.close();
         }
        } catch (SQLException e) {
            throw e;
        }
    }
}
