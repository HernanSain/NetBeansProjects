/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecol;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public void  lista(String sql) throws Exception {
        ArrayList<String> lst = new ArrayList<String>();
        try {
            conectDB();
//            stm = con.createStatement();
//            rst = stm.executeQuery(sql);
//            int c = rst.getMetaData().getColumnCount();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute(sql);
            rst = pstm.getResultSet();
            int c = rst.getMetaData().getColumnCount();


            while (rst.next()) {
                for (int i = 1; i < c; i++) {
                    String[] s = new String[c];
                    s[i] = rst.getString(i);
//                    System.out.print(s[i] + " ");
//                    System.out.print(rst.getRow() + " col " + i + " ");
                    lst.add(s[i]);
                }
            }
            for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i)+" ");
 
            }
            

            desconectDB();
        } catch (SQLException e) {
            throw e;
        }
 
    }

}
