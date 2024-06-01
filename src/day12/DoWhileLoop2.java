package day12;

import java.util.Scanner;

public class DoWhileLoop2 {


    public static void main(String[] args) {


        Scanner scan =  new Scanner(System.in);

        String answer;

        do {
           System.out.print("Please enter miles to convert to kms: ");

           double miles = scan.nextDouble();

           System.out.println(miles + " in kms: " + (miles * 1.6));

           System.out.println("Do you want to continue? (yes/no):");

           answer = scan.next();

       }while (!answer.equals("no"));




        System.out.println("Bye");



    }
}
