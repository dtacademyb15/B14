package sorting;

import java.util.Arrays;
import java.util.Random;

public class TwoDArray {


    public static void main(String[] args) {



        String [] names = {"Bob", "Alice"};

        String[][] customers = { {"Bob", "26", "232-32-3232"}, {"Alice", "32", "342-11-3223"} };


        int[][] arr;
        int arr2 [][];
        int [] arr3 [];

        int[][] numSets = new int[4][3];

        int[][] numsetsvisualized = { {0,0,0}, {0,0,0}, {0,0,0}, {0,0,0} };

        System.out.println(numSets);

        System.out.println(Arrays.deepToString(numSets));

        //Access 2d array elements

        numSets[0][1] = 99;

        System.out.println(Arrays.deepToString(numSets));

        numSets[2][2] = 100;

        System.out.println(Arrays.deepToString(numSets));

//        numSets[4][3] = 100; //Index 4 out of bounds for length 4


        // iterate through a 2d array

        System.out.println(numSets.length); // outer array length
        System.out.println(numSets[0].length); // inner array length

        for (int i = 0; i < numSets.length; i++) {

            for (int j = 0; j < numSets[i].length; j++) {
                numSets[i][j] = new Random().nextInt(100);
                System.out.print(numSets[i][j] + "\t");
            }
            System.out.println();
        }






    }
}
