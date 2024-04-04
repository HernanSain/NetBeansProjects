/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.persistencia;

import java.sql.SQLException;

/**
 *
 * @author john
 */
public class DAOCurso extends DAO {

    public void nuevoCurso(String sql) throws Exception {
        try {
            conectDB();
            stm = con.createStatement();
            stm.execute(sql);
            desconectDB();
        } catch (SQLException e) {
            throw e;
        }
    }
}
