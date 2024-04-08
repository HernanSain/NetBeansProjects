/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecol;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<String> lst = new ArrayList<String>();
        try {
            conectDB();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute(sql);
            rst = pstm.getResultSet();
            int c = rst.getMetaData().getColumnCount();

            while (rst.next()) {

                for (int i = 1; i < (c); i++) {
                    String[] s = new String[c];
                    s[i] = rst.getString(i);

                    lst.add(s[i]);
                }
                lst.add(rst.getString(c));
            }
            int cont = 1;
            Iterator it = lst.iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + " / ");
                cont++;
                if (cont > c) {
                    System.out.println("");
                    cont = 1;
                }
            }
//            System.out.println(lst);

            desconectDB();
        } catch (SQLException | StringIndexOutOfBoundsException e) {
            throw e;
        }

    }

}
