/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author John
 */
public class siEsPrimo {

    public boolean verSiEsPrimo(int x) {
        boolean primo = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

}
