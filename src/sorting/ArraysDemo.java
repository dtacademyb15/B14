package sorting;
import java.util.Arrays;
public class ArraysDemo {

    public static void main(String[] args) {


        int[] arr = {1,34,45,2,5,62,4};

        int[] clone = arr.clone(); // clone creates a copy of the array

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        //[1, 2, 4, 5, 34, 45, 62]

        // Array must be sorted for binary search
        int indexOfTheSearchedItem = Arrays.binarySearch(arr, 45);
        System.out.println(indexOfTheSearchedItem);




        //Partial sort

        int[] arr2 = {6, 2, 2, 2, 5,3,1,5,1};

        int indexOfFirstOddNumber = -1; // invalid index
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 != 0){
                indexOfFirstOddNumber = i;
                break;
            }
        }

        Arrays.sort(arr2, 0, indexOfFirstOddNumber);
        Arrays.sort(arr2, indexOfFirstOddNumber, arr2.length);

        System.out.println(Arrays.toString(arr2));



   // Binary search index when an item is not found

        int[] nums =  {1, 2, 4, 5, 34, 45, 62};

        System.out.println(Arrays.binarySearch(nums, 6));// -5
        System.out.println(Arrays.binarySearch(nums, 50));// -7
        System.out.println(Arrays.binarySearch(nums, 1000));// -8
        System.out.println(Arrays.binarySearch(nums, -23));// -1


    }
}
