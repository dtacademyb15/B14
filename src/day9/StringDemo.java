package day9;

public class StringDemo {


    public static void main(String[] args) {


//        MyString myString = new MyString();

//        String str = new String(); // create an empty string object using the traditional object creation syntax
//        String str2 = new String("hello");

        String str = "helloworld";
        int numOfChars = str.length();
        System.out.println(numOfChars);

        System.out.println("hello".length());
        System.out.println("".length()); // empty string is a valid string

        char ch = str.charAt(0);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(4));
        int strsLength = str.length();
        System.out.println(str.charAt(strsLength-1));
        System.out.println(str.charAt(str.length()-1)); // the last index of any string can be obtained by length() -1


        System.out.println("Hello Hi".length()); // 8 chars

        String name = "John Doe";

//        System.out.println(name.charAt(8));//StringIndexOutOfBoundsException
//        System.out.println(name.charAt(10));//StringIndexOutOfBoundsException
//        System.out.println(name.charAt(-1));//StringIndexOutOfBoundsException

//        System.out.println(name.charAt(name.length())); //StringIndexOutOfBoundsException
        System.out.println(name.charAt(name.length()-1));


        System.out.println("hello".concat(" world"));
        String st1 = "Hi";
        String st2 = "Universe";

       // st1.concat(st2); // simply calling a method on a String does NOT change the string's value
        st1 = st1.concat(st2); // to see the result you can re-assign the value to the object

        System.out.println(st1);


        String str3 = "An Example of A String With Different CASES";

        // String immutability
        // Calling a method on a string does not change the string but returns a new string with modified value
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
        System.out.println(str3);


        System.out.println("    \n\n a string   with  spaces\n\t       ".trim());


        String text = "  An example of a text  ";

        text.toUpperCase();
        text.trim();
        text.toLowerCase();

        System.out.println(text);





    }
}
