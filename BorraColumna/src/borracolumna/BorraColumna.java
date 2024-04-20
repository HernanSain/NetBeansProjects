/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borracolumna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author john
 */
public class BorraColumna {

    static public void conecta() throws Exception {
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            String url = "jdbc:mysql://localhost:3306/colegio?zeroDateTimeBehavior=convertToNull";
            Connection con = DriverManager.getConnection(url);
            Statement stm;
            stm = con.createStatement();
            String sql = "insert into estudiantes (estudiante) values ('Paquita la del Barrio');";
            stm.execute(sql);
            con.close();
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {
        try {
            conecta();

        } catch (Exception e) {

        }
    }

}
