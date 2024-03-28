/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsstudy;

/**
 *
 * @author John
 */
public class ThreadsStudy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main m = new Main();
        m.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("esta linea is out of the thread");
        }
        Main2 m2 = new Main2();
        m2.run();

    }

}
