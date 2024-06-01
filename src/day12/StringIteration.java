package day12;

public class StringIteration {


    public static void main(String[] args) {



        String str = "Hello World";
        String strWithSpaces = "";
        for (int i = 0; i < str.length(); i++) {
           strWithSpaces += str.charAt(i) + " ";
        }

        System.out.println(strWithSpaces);




    }
}
