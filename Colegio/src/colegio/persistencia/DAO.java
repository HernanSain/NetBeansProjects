/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.persistencia;

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
    protected ResultSet res;
    final String database = "colegio";
    final String driver = "com.mysql.jdbc.Driver";
    final String user = "root";
    final String password = "root";

    public void conectDB() throws Exception {
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/colegio?zeroDateTimeBehavior=convertToNull";
            con = DriverManager.getConnection(url, "root", "root");

        } catch (SQLException ex) {
            con = null;
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
        }
    }

    public void desconectDB() throws Exception {
        try {
            conectDB();
            if (res != null) {
                res.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null){
                con.close();
            }
        } catch (Exception e) {
        }
    }
    
    public void alterDB(String sql)throws Exception{
        try {
            conectDB();
            stm = con.createStatement();
            stm.execute(sql);
            desconectDB();
        } catch (SQLException e) {
            con.rollback();
            throw e;
        }
    }
    
    public void queryDB(String sql)throws Exception{
        try {
        conectDB();
        stm = con.createStatement();
        res = stm.executeQuery(sql);
        desconectDB();
        } catch (Exception e) {
        }
        
    }

}
