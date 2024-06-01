package arrays;

public class FindMax {


    public static void main(String[] args) {


        int[] arr = {3,4,6,1,230,89,34,23,670,34,8};

        // Find the max
        // In a sorted array: Sort and obtain the last value

        // In an unsorted array:

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] > max ){
                max = arr[i];
            }
        }

        System.out.println("The max value is " + max);

    }
}
