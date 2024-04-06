/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela.persistencia;

import escuela.dominio.Curso;

/**
 *
 * @author sainh
 */
public final class CursoDAO extends DAO {

    public void guardarCurso(Curso c) throws Exception {
        try {
            conectar();
            sent = conex.createStatement();
            String sql = "insert into cursos (curso) value" + "('" + c.getCurso() + "');";
            // insert into cursos (curso) value ('c.getCurso()');
        } catch (Exception e) {
            throw e;
        } finally {
            desconectar();
        }
    }

    public void alterarCurso(Curso c) throws Exception {
        try {
            conectar();
        } catch (Exception e) {
        }

    }

}
