/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

import entities.OuterClass;
import entities.OuterClass.InnerClass;

/**
 *
 * @author John
 */
public class InnerClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        InnerClass ic = oc.new InnerClass();
        System.out.println(oc.x);
        System.out.println(ic.y);
    }

}
