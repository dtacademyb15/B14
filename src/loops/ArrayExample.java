package loops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {


        Scanner input  = new Scanner(System.in);

        System.out.print("How many scores you want to enter:");

        int size =  input.nextInt();

        int[] scores = new int[size];

        System.out.println("Please enter the scores:");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }

        System.out.println("Your entries are: " + Arrays.toString(scores));

        // Get the average

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
           sum = sum + scores[i];
        }

        double average = sum / scores.length;
        System.out.println("The average of the scores: " + average );

        System.out.print("The scores that are above average: " );
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= average){
                System.out.print(scores[i] + " ");
            }
        }

    }
}
