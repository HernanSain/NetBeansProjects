/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecol;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {

    protected Connection con;
    protected Statement stm;
    protected ResultSet rst;

    final String database = "colegio";
    final String user = "root";
    final String password = "root";
    final String driver = "com.mysql.jdbc.Driver";

    public void conectDB() throws Exception {
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/colegio?zeroDateTimeBehavior=convertToNull";
            con = DriverManager.getConnection(url, "root", "root");

        } catch (SQLException e) {
            throw e;
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
            throw e;
        }
    }

}
