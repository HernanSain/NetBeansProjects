/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststudy;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudy {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        
        Marcas m1 = Marcas.Citroen;
        cars.add(m1.name());
        Marcas m2 = Marcas.Mercedes_Benz;
        cars.add(m2.name());
        Marcas m3 = Marcas.Rolls_Roice;
        cars.add(m3.name());
        Marcas m4 = Marcas.Vols_Wagen;
        cars.add(m4.name());
        Marcas m5 = Marcas.Ford;
        cars.add(m5.name());
        ServiCar sc = new ServiCar();
        int n = 0;
        while (n == 0) {
            System.out.println("1:ingresar 2:listar 3:cambiar 4:borrer 5:salir");
            try {
                n = leer.nextInt();
                switch (n) {
                    case 1:
                        n = 0;
                        String marca = sc.ingreseMarca();
                        cars.add(marca);
                        break;
                    case 2:
                        n = 0;
                        sc.listaMarcas(cars);
                        break;
                    case 3:
                        n = 0;
                        sc.cambia(cars);
                        break;
                        case 4:
                        n=0;
                        sc.borra(cars);
                        leer.nextLine();
                        break;
                    case 5:
                        n=1;
                }
            } catch (Exception e) {
                System.out.println("debe ser un entero");
                leer.nextLine();
            }
        }
    }
}
