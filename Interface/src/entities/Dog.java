/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author John
 */
public  class Dog implements Animal{
    @Override
    public void animalSound(){
        System.out.println("guau");
                
    }
    @Override
    public void animalRun(){
        System.out.println("dog running");
    }
}
