package day11;

import java.util.Scanner;

public class WhileLoopDemo {


    public static void main(String[] args) {


        System.out.println("Please choose one of the following:");
        System.out.println("1.Checking");
        System.out.println("2.Savings");
        System.out.println("3.Deposit");
        System.out.println("4.Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int tries = 1;

        while( !(choice>=1 && choice<=4)){
            System.out.println("You've entered invalid choice. Please enter 1-4:");
            choice = scanner.nextInt(); // re-acquiring the input
            tries++;
            if(tries == 3){
                System.out.println("You exceeded the tries. Program is terminating...");
                System.exit(3);
            }
        }

        switch (choice){
            case 1 -> System.out.println("Checking logic...");
            case 2 -> System.out.println("Savings logic...");
            case 3 -> System.out.println("Deposit logic...");
            case 4 -> System.out.println("Exiting...");
        }




    }
}
