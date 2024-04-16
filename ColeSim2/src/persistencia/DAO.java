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
    private String database = "colegio";
    private String user = "root";
    private String password = "root";
    private String driver = "com.mysql.jdbc.Driver";

    public void conectDB() throws Exception {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio",user,password);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void desconectDB() throws Exception {
        try {
            if (stm != null) {
                stm.close();
            }
            if (rst != null) {
                rst.close();
            }
            if (con != null) {
                con.close();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
