package arrayReview;

import java.util.Arrays;
import java.util.Random;

public class TwoDArrayReview {


    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        int[][] arr2 = { {0,0}, {0,0}, {0,0}   };


        int[][] arr3 = {
                {32,2,45,5},
                {12,11},
                {45,44,46},
                {9}
        };

        int[][] nums = new int[4][];

        System.out.println(Arrays.deepToString(nums));

        nums[0] = new int[2];

        System.out.println(Arrays.deepToString(nums));

        nums[1] = new int[]{2,3,4};

        System.out.println(Arrays.deepToString(nums));



        int[][] numbers = new int[4][3];

        System.out.println(Arrays.deepToString(numbers));

        numbers[2] = new int[]{99};

        System.out.println(Arrays.deepToString(numbers));

        System.out.println(numbers.length);
        System.out.println(numbers[1].length);
        System.out.println(numbers[2].length);


        int[][] array = {
                {32,2,45,5,6},
                {12,11,22,44},
                {45,44,46},
                {9,67},
                {2}
        };

        // Sum
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(1000);
                sum += array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Sum: "  + sum);

        for ( int[] each : array){
            for ( int el  : each) {
                System.out.print( el + "\t");
            }
            System.out.println();
        }





        double [][][] studentScores = new double[10][3][2];

        System.out.println(Arrays.deepToString(studentScores));

        double [][][] studentScores2 =
                {
                        { {66,78}, {45,23}, {78,45} },
                        { {66,78}, {45,23}, {78,45} },
                        { {66,78}, {45,23}, {78,45} }
                };


        int[][] coll = {
                {32,2,45,5,1},
                {12,11,22,44,1},
                {45,44,46,23,1},
                {9,67,24,12,1},
                {1,1,1,1,1}
        };


        System.out.println(getSumOfRow(coll, 4));
        System.out.println(getSumOfColumn(coll, 4));

    }

    public static int getSumOfRow(int[][] coll, int rowIndex){
        int total = 0;

            for (int j = 0; j < coll[rowIndex].length ; j++) {
                total += coll[rowIndex][j];
            }


        return total;
    }

    public static int getSumOfColumn(int[][] coll, int columnIndex){
        int total = 0;
        for (int i = 0; i < coll.length; i++) {
                total += coll[i][columnIndex];
        }



        return total;
    }
}
