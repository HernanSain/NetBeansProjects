/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author sainh
 */
public class DAO {

    protected Connection conex;
    protected Statement sent;
    protected ResultSet res;

    private final String user = "root";
    private final String password = "root";
    private final String database = "escuela";
    private final String driver = "com.mysql.jdbc.Driver";

    protected void conectar() throws Exception {
        try {
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/escuela?zeroDateTimeBehavior=convertToNull";
            conex = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    protected void desconectar() throws Exception {
        try {
            if (res != null) {
                res.close();
            }
            if (sent != null) {
                sent.close();
            }
            if (conex != null) {
                conex.close();
            }

        } catch (Exception e) {
            throw e;
        }
    }

    protected void altera(String sql) throws Exception {
        try {
            conectar();
            sent = conex.createStatement();
            sent.executeUpdate(sql);
            desconectar();
        } catch (SQLException | ClassNotFoundException e) {
            conex.rollback();

//            SET autocommit = 1;
//            COMMIT;
            throw e;
        } finally {
            desconectar();
        }
    }
    
    protected void consulta(String sql)throws Exception{
        try {
            conectar();
            sent = conex.createStatement();
            res = sent.executeQuery(sql);
            
        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        }
    }
    }
    
