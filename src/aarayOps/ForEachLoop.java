package aarayOps;

import java.util.Arrays;

public class ForEachLoop {


    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6};

        String [] names = {"Alice", "Bob", "Jane", "Allison"};


        for ( int e : numbers){
            System.out.println(e);
        }


        String sentence = "Leo loves burgers";
        String[] split = sentence.split(" ");

        for(String each: split){
            System.out.println(each.toUpperCase());
        }

        // For each loop limitations:
        // - cannot iterate in reverse, partial order
        // - cannot perform any index based operations
        // - cannot update/modify array content


        int[] nums = {1,2,3,4,5,6};

//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = nums[i]*100;
//        }

        // shortcut  -> iter
//        for (int num : nums) {
//            num = num * 10;
////            System.out.println(num);
//        }

        System.out.println(Arrays.toString(nums));

        for (char ch : "hello world".toCharArray()) {
            System.out.println(ch);
        }


    }
}
