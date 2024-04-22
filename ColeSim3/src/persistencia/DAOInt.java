/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author john
 */
public class DAOInt extends DAO {

    public void nuevoRegistro(String sql) throws Exception {
        try {
            conectaDB();
            stm = con.createStatement();
            stm.execute(sql);
//            System.out.println(sql);
            desconectaDB();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listaRegistros(String sql) throws Exception {
        try {
//            System.out.println(sql);
            conectaDB();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute(sql);
            rst = pstm.getResultSet();
            int c = rst.getMetaData().getColumnCount();
            ArrayList<String> lst = new ArrayList<String>();
            while (rst.next()) {
                String s = "";
                 s = rst.getString(2);
                lst.add(s);
            }
            
//            System.out.println(lst.size());
            
            Iterator it = lst.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
