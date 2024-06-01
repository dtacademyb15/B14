package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {



     int [] arr = {2,3,4,1,5,0};

        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length ; j++) {

                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

//            System.out.println("The array after iteration " + i + ": " + Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));


        // Time complexity -> efficiency of an algorithm

        // O(N^2) -> Quadratic time complexity -> e.g using nested loops for sorting, or finding a duplicate
        // O(N) -> linear time complexity -> e.g -> linear search (whenever you do a single pass through an array)
        // O(logN) -> logarithmic time complexity -> e.g Binary search
        // O(1) -> constant -> array access

        // Space complexity -> how much memory doe the algorithm use

    }


}
