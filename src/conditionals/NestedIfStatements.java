package conditionals;

import java.sql.SQLOutput;

public class NestedIfStatements {


    public static void main(String[] args) {


        int number= 111;

        // Spaghetti code
        if ( number >= 0){
            System.out.println("Positive");
            if(number % 2 == 0){
                System.out.println("Even");
                if(number > 100){
                    System.out.println("Greater than 100");
                }

            }else{
                System.out.println("Odd");
            }

        }else {
            System.out.println("Negative");

            if(number % 3 == 0){
                System.out.println("Divisible by 3");
            }
        }


    }
}
