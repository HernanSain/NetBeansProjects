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
    final String database = "colegio";
    final String user = "root";
    final String password = "root";

    public void conectaDB() throws Exception {

        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/colegio";
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        }
    }

    public void desconectaDB() throws Exception {
        try {
            if (stm != null) {
                stm.close();
            }
            if (rst != null) {
                rst.close();
            }
            if (con!=null){
                con.close();
            }
        } catch (SQLException e) {
            throw e;
        }

    }
}
