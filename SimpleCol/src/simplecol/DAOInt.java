/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecol;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author john
 */
public class DAOInt extends DAO {

    public void nuevo(String sql) throws Exception {
        try {
            conectDB();
            stm = con.createStatement();
            stm.execute(sql);
            desconectDB();
        } catch (SQLException e) {
            throw e;
        }
    }

    public void lista(String sql) throws Exception {
        try {
            conectDB();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute(sql);
            int c = pstm.getMetaData().getColumnCount();
            for (int i = 1; i <= c; i++) {
                String x =pstm.getMetaData().getColumnName(i);
                System.out.println(x);
            }
            

            desconectDB();
        } catch (SQLException e) {
            throw e;
        }
    }

}
