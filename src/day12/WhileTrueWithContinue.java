package day12;

import java.util.Scanner;

public class WhileTrueWithContinue {


    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Daily Expense Tracker!");


        double total = 0;

        while (true){

            System.out.println("Please enter your latest expense amount: ");
            double expense = input.nextDouble();

            if(expense<0){
                System.out.println("Invalid value. Please enter a positive value.");
                continue;
            }

            System.out.println("Do you have more expenses to enter for the day? (yes/no): ");
            String answer = input.next();

            total += expense;

            if(answer.equalsIgnoreCase("no")){
                break;
            }
        }

        System.out.println("You have spent a total of $" + total + " today!");





    }
}
