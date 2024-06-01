package day9;

public class SubstringMethod {

    public static void main(String[] args) {


        String str = "Welcome to Java";


        String portion = str.substring(11); // starts with given index till the end
        System.out.println(portion);

        String subStr = str.substring(0, 3); // uses start and end indexes, end index is not part of substring

        System.out.println(subStr);
        System.out.println(str.substring(3, 7));

//        System.out.println(str.substring(-1)); // StringIndexOutOfBoundsException
        System.out.println(str.substring(15)); //empty string
        System.out.println(str.substring(14)); //a
        System.out.println(str.substring(14,15)); //a
//        System.out.println(str.charAt(15));

        System.out.println(str.substring(0,1)); //W
        System.out.println(str.substring(2,2)); // empty string
//        System.out.println(str.substring(2,1)); // StringIndexOutOfBoundsException

        // Dynamically obtain certain portion of any string

        // Get the first 3 chars of a str

        String myStr = "Suggest";
        System.out.println(myStr.substring(0, 3));

        // Get the last 2 chars

        System.out.println(myStr.substring(myStr.length()-2));

        //Second half
        String word = "Intelligence";
        System.out.println(word.substring(word.length()/2));

        // First half
        System.out.println(word.substring(0, word.length()/2));

        String price =  "$324.34 USD";

        String numericPart = price.substring(1, price.length()-4 );
        System.out.println(numericPart);

        System.out.println(getPortion(price));

        System.out.println(59 * 87);


    }



    public static String getPortion(String price){


        return price.substring(1, price.length() - 4);
    }
}
