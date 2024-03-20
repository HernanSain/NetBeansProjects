/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumstudy;

import entities.Level;

/**
 *
 * @author John
 */
public class EnumStudy {

//    enum Level {
//        Low, Medium, High
//    }

    public static void main(String[] args) {
        Level myLevel = Level.High;
        Level l2 = Level.Medium;
        System.out.println("myLevel is "+myLevel);
        System.out.println("l2 is "+l2);

    }

}
