package april1;

import mar29.Doctor;
import mar29.Student;
import march25.*;
import march25.innerpack.Hello;


import java.util.Scanner;
//import java.lang.*;

//import static java.util.Arrays.sort;
//import static java.util.Arrays.binarySearch;
//import static java.util.Arrays.fill;
import static java.util.Arrays.*;

import static java.lang.Math.PI;






public class ImportStatic {


    public static void main(String[] args) {

        // regular imports are for importing classes that are outside the current package
        MyClass my = new MyClass();
        Doctor doctor = new Doctor();
        Kenan kenan = new Kenan();
        Hello hello = new Hello();

        String str = new String();
        Character sh;
        Scanner scan = new Scanner(System.in);

        sort(new int[]{});
        //static imports are for importing static members of the class (variables and methods)
//        int [] arr =  new int[4];
////        Arrays.toString(arr);
//         sort(arr);
//       binarySearch(arr, 3);
//       fill(arr,4);
//
//        System.out.println(PI);
//



    }

    public static void myMethod(){}
}
