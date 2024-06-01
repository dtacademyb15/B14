package arrays;

import java.util.Arrays;

public class ToCharArray {

    public static void main(String[] args) {


        String str = "Hello World";  // dello WorlH

        // convert the string into array of chars

        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        char temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;


        System.out.println(Arrays.toString(arr));

        //Convert the char array to a String

//        String str2 = String.valueOf(7);
        String converted = String.valueOf(arr);
        System.out.println(converted);

//        String str2 = new String(); // empty string
//        String str3 = new String("java"); //
        String str4 = new String(arr); // create a string from char array


        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("civil"));


        System.out.println(reverseStringUsingArray("Hello World"));
    }


    // palindrome -> civic

    // reverse a string ->  Java is fun -> nuf si avaJ

    public static String reverseStringUsingArray(String str){

        char[] arr = str.toCharArray();

        for (int i = 0, j = arr.length-1; i < j ; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


        return String.valueOf(arr);
//        return new String(arr);

    }



    public static boolean isPalindrome(String str){
        char[] arr = str.toCharArray();
        for (int i = 0, j = arr.length-1;  i < j ; i++, j--) {
            if(arr[i] != arr[j] ){
                return false;
            }
        }

        return true;
    }
}



