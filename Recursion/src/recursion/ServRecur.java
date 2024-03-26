/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author John
 */
public class ServRecur {
    public int sum(int n){
        if (n>0){
         n =  n + sum(n-1);            
        }else{
            n=0;
        };
return n;
    }
    
}
