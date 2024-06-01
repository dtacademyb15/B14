package loops;

import java.util.*;

public class ArraysDemo {


    public static void main(String args []) {


        int age = 56;
        int age2 = 45;


        // store 10 student's scores {67,56,99,56,88,78,69}

//        int[] scores; // arrays are objects
//        scores = new int[10]; // array size must be given when creating an object

        int[] arr;
        double[] arr2;
        char[] ch2;
        String[] strs;
        int arr3 []; // C style syntax

        int[] scores = new int[10]; // creation of an array object
        scores[0] = 67;

        System.out.println(scores[0] * scores[0]);

        System.out.println(scores); // [I@36baf30c -> memory location
//        String content = Arrays.toString(scores);
//        System.out.println(content);
        System.out.println(Arrays.toString(scores)); //[67, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        boolean bools [] =  new boolean[5];

        System.out.println(Arrays.toString(bools)); // [false, false, false, false, false]

        String[] names =  new String[4]; // size 4
        names[0] = "Bob";
        names[1] = "Alice";
        names[2] = "Jane";
//        names[3] = "Jack";
//        names[4] = "Jack"; // access an element at wrong index
//        names[-2] = "Jack"; // access an element at wrong index
//        names[1000] = "Jack"; // access an element at wrong index
        //ArrayIndexOutOfBoundsException


        System.out.println(Arrays.toString(names));

        System.out.println(names[0].toUpperCase());
        System.out.println(names[2].substring(2));


        String[] another =  {"Bob", "Alice", "Jane"};
        System.out.println(Arrays.toString(another));

        String[] another2 =  new String[]{"Bob", "Alice", "Jane"};
        int[] arr4 =  new int[] {1,2,3,4};

        int size = arr4.length;
        System.out.println(arr4.length);


        // To iterate through an array for loop

        int[] numbers =  {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]*numbers[i] + " ");
        }

        System.out.println();

        // Arrays are mutable, you can change the content, re-assign element values

        numbers[0] = 99;

        System.out.println(Arrays.toString(numbers));

        // Update array element values using a loop

//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = 0;
//        }

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 10;
        }

        System.out.println(Arrays.toString(numbers));

        //Default values

        byte[] ar1 = new byte[10];
        System.out.println(Arrays.toString(ar1));

        double[] ar2 = new double[10];
        System.out.println(Arrays.toString(ar2));

        boolean [] booleans = new boolean[10];
        System.out.println(Arrays.toString(booleans));

        char[] chars = new char[10];
        System.out.println(Arrays.toString(chars));

        Character[] chars2 = new Character[10];
        System.out.println(Arrays.toString(chars2));

        String[] strs1 = new String[10];
        System.out.println(Arrays.toString(strs1));






    }
}
