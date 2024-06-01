package arrayReview;

import java.util.Arrays;

public class MethodOverloading {


    public static void main(String[] args) {


        // Method overloading -> creating a method with the same name but different parameters in the same class
        String str = "hello";

        str.substring(1);
        str.substring(1,3);

        str.indexOf("h");
        str.indexOf("h", 3);


        Arrays.sort(new int[]{});
        Arrays.sort(new char[]{});
        Arrays.sort(new String[]{});


        Arrays.fill(new int[]{1,2,3}, 6);
        Arrays.fill(new int[]{1,2,3,5,6},1,4, 6);





        add(3, 89);
        add(3.4,6.7);
        add(1,2,3);


    }


    public static void add(int a, int b){
        System.out.println("Ints");
        System.out.println(a+b);
    }

    public static void add(String a, String b){
        System.out.println("Ints");
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println("3 Ints");
        System.out.println(a+b+c);
    }


    public static void add(double a, double b){
        System.out.println("doubles");
        System.out.println(a+b);
    }





    // For overloading, the only thing that matters is the method signature (name+parameters)
    // name of the method stays the same, parameters should be different
    // Return type, visibility and static/non-static does not matter for overloading



    public static void subtract(int a, int b){
        System.out.println(a-b);
    }


//    private int subtract(int a, int b){
//            return a-b;
//    }



}
