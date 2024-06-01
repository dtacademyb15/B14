package sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayEquality {

    public static void main(String[] args) {


        String str1 ="HELLO";
        String str2 ="HELLO";

        System.out.println(str1.equals(str2));

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println(arr1.equals(arr2)); // You should not use equals() method OF array object, it compares the meory location not the content

        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result);

        int[] arr4 = new int[100];
        Arrays.fill(arr4, 99);
        System.out.println(Arrays.toString(arr4));
        Arrays.fill(arr4, 0, 5, 1);
        Arrays.fill(arr4, 5, 10, 2);
        Arrays.fill(arr4, arr4.length-5, arr4.length, 10);
        System.out.println(Arrays.toString(arr4));


        int[] nums = {1,2,3};
        int[] cloned = nums.clone();

        System.out.println(nums);
        System.out.println(cloned);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(cloned));

//        int[] copied = Arrays.copyOf(nums, 10);
        int[] copied = Arrays.copyOf(nums, 2);

        System.out.println(Arrays.toString(copied));

        int[] numbers = {100,30,70,4,5,6,7,8,9};

        int[] copiedFirstThree = Arrays.copyOfRange(numbers, 0, 3);
        int[] copiedLastFive = Arrays.copyOfRange(numbers, numbers.length-5, numbers.length);

        System.out.println(Arrays.toString(copiedFirstThree));
        System.out.println(Arrays.toString(copiedLastFive));

        String[] names = new String[]{"Beta", "epsilon", "theta", "tgeta", "1alpha", "gamma", "gammax"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));


    }
}
