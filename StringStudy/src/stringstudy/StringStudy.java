package stringstudy;

public class StringStudy {

    public static void main(String[] args) {
        String st = "La concha de la lora puta";
        //charAt() length()
        //        for (int i = 0; i < st.length(); i++) {
        //            System.out.print(st.charAt(i) + " " + st.codePointAt(i));//charAt()
        //            System.out.println("");
        //        }

        //compareTo()
        //        String s1 = "b";
        //        String s2 = "a";
        //        System.out.println(s1.compareTo(s2));
        //concat()
        String st2 = " ¡y que viva el papo!";
        System.out.println(st.concat(st2));
        //contains()
        if (st.contains("conchal")) {
            System.out.println("concha");
        } else {
            System.out.println("no concha");

            //containsEqual()
            String st3 = "La concha de la lora pura";
            System.out.println(st.contentEquals(st3));
        }
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);
    }
}
