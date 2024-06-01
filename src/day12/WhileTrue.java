package day12;

import java.util.Scanner;

public class WhileTrue {


    public static void main(String[] args) {


        int num = 0;

        while(true){

            System.out.println(num);
            num++;

            if(num == 1000){
                break;
            }

        }


        Scanner scan =  new Scanner(System.in);


        while(true){

            System.out.print("Please enter miles to convert to kms: ");

            double miles = scan.nextDouble();

            System.out.println(miles + " in kms: " + (miles*1.6));

            System.out.println("Do you want to continue? (yes/no):");

            String answer = scan.next();

            if(answer.equals("no")){
                break;
            }

        }



        System.out.println("Bye");




    }
}
