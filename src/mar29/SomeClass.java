package mar29;

public class SomeClass {


    public static void main(String[] args) {


        reverseString("Hello");

        StringUtility.reverseString("dbsdv");


    }


    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
