package day9;

public class TernaryBasic {


    public static void main(String[] args) {



        int number = 16;

        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        String result  = number % 2 == 0 ?  "Even" :  "Odd";

        System.out.println( number % 2 == 0 ?  "Even" :  "Odd"   );







    }
}
