package day12;

import java.util.Scanner;

public class DoWhileWithContinue {


    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Daily Expense Tracker!");


        double total = 0;
        String answer;
       do{

            System.out.println("Please enter your latest expense amount: ");
            double expense = input.nextDouble();

            System.out.println("Do you have more expenses to enter for the day? (yes/no): ");
            answer = input.next();

            total += expense;


        }while (answer.equalsIgnoreCase("yes"));

        System.out.println("You have spent a total of $" + total + " today!");





    }
}
