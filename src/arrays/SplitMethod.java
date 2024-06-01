package arrays;

import java.util.Arrays;

public class SplitMethod {


    public static void main(String[] args) {

        String str =  "Chester loves cheetos. And he also loves burgers, fries; he likes shakes-shakes too";

        String[] arr= str.split(" ");
//        String[] arr= str.split("[ ,.;-]"); // combined regex

        System.out.println(Arrays.toString(arr));

        // Modify each word by adding X to it

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + "X";
        }

        System.out.println(Arrays.toString(arr));

        // Build the sentence back -> ChesterX lovesX cheetosX
//
////        String coll = "";
////        for (int i = 0; i < arr.length; i++) {
////            coll += arr[i] + " ";
////        }
////
////        System.out.println(coll.trim());
//
        String joined = String.join(" ", arr);
        System.out.println(joined);
//

    }
}
