/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner;

import entities.Outer;

/**
 *
 * @author John
 */
public class Inner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Outer o = new Outer();
        
        Outer.InnerClass oi =  o.new InnerClass();
        System.out.println(o.x+" + "+oi.y+" = "+(o.x+oi.y));
    }

}
