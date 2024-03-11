package asteriscos;

public class Dibujo {

    public void cuadrado(int la) {
        //first line
        for (int i = 0; i < la; i++) {
            System.out.print("* ");
        }
        //(la-2) lines
        System.out.println("");

        for (int i = 1; i < (la - 1); i++) {
            System.out.print("* ");
            for (int j = 1; j < (la - 1); j++) {
                System.out.print("  ");
            }
            System.out.print(" *");
            System.out.println("");
        }
        //ultima linea
//        System.out.println("");
        for (int i = 0; i < la; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }

}
