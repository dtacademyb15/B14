package april8;

import mar29.Doctor;

import java.util.Scanner;

public class StringPool2 {


    public static void main(String[] args) {


        String str1 = new String("java");
        String str2 = new String("java");
        String str5 = new String("cat");
        System.out.println(str1 == str2); // memory location
        System.out.println(str1.equals(str2)); // values

        String str3 = "cat";
        String str4 = "cat";

        System.out.println(str3 == str4); // memory location
        System.out.println(str3.equals(str4)); // value

        // How many string objects are created here:
        String str6 = new String("dog");
        String str9 = "dog";
        String str7 =  "dog";
        String str8 =  "dog";

        // Two - one in the pool("dog"), one in the heap (new String("dog"))


        System.out.println("dog".toUpperCase() == "DOG"); //false beacuse one is creating an object and another one is on the pool



    }
}
