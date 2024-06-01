package march25;

import java.util.Arrays;
import java.util.List;

public class VarArgs {


    public static void main(String... args) {

        System.out.println("Main method");




        add(2,3);
        add(3,4,5);
        add(4,5,1,2);
        add(1,2,3,4,5,6,7,2,3,4,5,6);
        add();

        multiply(2,2);

//        concat("dsds", 1);
//        concat("dsds" );


        subtract(1,2,3,5);
        subtract(new int[] {1,2,3,5});

        divide(new int[] {1,2});
//        divide(1,2,3,4);
    }
    public static void multiply(int a, int... args){

    }

    public static void subtract(int... args){
        System.out.println(Arrays.toString(args));
    }

    public static void divide(int[] arr){
        System.out.println(Arrays.toString(arr));
    }


    public static void add(int... args){
//        System.out.println(args); // args -> an array
//        System.out.println(Arrays.toString(args));
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum+=args[i];
        }

        System.out.println(sum);
    }


    public static void concat(String str, int... args2){

    }


//    public static void add(int a, int b){
//
//    }
//
//    public static void add(int a, int b, int c){
//
//    }
//
//    public static void add(int a, int b, int c, int d){
//
//    }


}
