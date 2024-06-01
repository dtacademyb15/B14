package arrayReview;

import org.w3c.dom.ls.LSOutput;

public class OverloadingTypes {


    public static void main(String[] args) {
//        max(3,5);
    }

    public static void max(int a, int b){

    }

//    public static void max(int num1, int num2){
//
//    }

    // Overloading by changing the type of parameters
    public static void max(double a, double b){

    }
    // Overloading by changing the number of parameters
    public static void max(int a, int b, int c){

    }
    public static void max(){

    }

    //Overloading  by changing the order of parameters

    public static void concatenate(String str, int num){

    }

    public static void concatenate( int num, String str){

    }

    public static void main() {
        concatenate("scds", 56);
        concatenate(32, "56");
    }

}
