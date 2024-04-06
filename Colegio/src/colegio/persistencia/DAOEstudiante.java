/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio.persistencia;

/**
 *
 * @author john
 */
public class DAOEstudiante extends DAO {

    public void nuevoEstudiante(String sql) throws Exception {
        try {

            conectDB();
            stm = con.createStatement();
            stm.execute(sql);
            desconectDB();
        } catch (Exception e) {
        }
    }

}
