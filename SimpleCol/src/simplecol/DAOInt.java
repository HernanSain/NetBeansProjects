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
            PreparedStatement prst = con.prepareStatement(sql);
            rst = stm.executeQuery(sql);
            System.out.println(prst.getMetaData().getColumnName(2));
            desconectDB();
        } catch (SQLException e) {
            throw e;
        }
    }

}
