/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monocole;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author john
 */
public class MonoCole {

    public static Connection con;
    public static Statement stm;
    public static ResultSet rst;

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/colegio?zeroDateTimeBehavior=convertToNull");
            stm = con.createStatement();
        
            stm.execute("select * from cursos");
            int col = rst.getMetaData().getColumnCount();
            
            String[] res = new String[col];
            while(rst.next()){
                System.out.println(rst.getArray(2));
            }

        } catch (Exception e) {
        }

    }

}
