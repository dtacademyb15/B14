package day12;

import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {


        Scanner scan =  new Scanner(System.in);

        System.out.print("Please enter miles to convert to kms: ");

        double miles = scan.nextDouble();

        System.out.println(miles + " in kms: " + (miles*1.6));

        System.out.println("Do you want to continue? (yes/no):");

        String answer = scan.next();

        while(!answer.equals("no")){

            System.out.print("Please enter miles to convert to kms: ");

            miles = scan.nextDouble();

            System.out.println(miles + " in kms: " + (miles*1.6));

            System.out.println("Do you want to continue? (yes/no):");

            answer = scan.next();

        }



        System.out.println("Bye");




    }
}
