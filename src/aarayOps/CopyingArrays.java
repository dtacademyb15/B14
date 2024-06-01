package aarayOps;

import java.util.Arrays;

public class CopyingArrays {


    public static void main(String[] args) {


        int i = 67;
        int j = 99;

        i = j;

        System.out.println(i);
        System.out.println(j);

       int[] arr1 = {1,2,3};
       int[] arr2 = {4,5,6};

        System.out.println(arr1);
        System.out.println(arr2);
        arr1 = arr2;
       // Assignment for objects
      //  assigns the references only

        // assign arr2's pointer to arr1
        // arr1 will point to whatever object arr2 is pointing to

//       String str = new String("java");
//       String str2;
////       String str2 = null;
//       new String("java");


        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1);
        System.out.println(arr2);

        // Modify the array through one of the refernces

        arr1[0] = 40;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr2[1] = 50;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));



        int[] arr3 = {1,2,3};
        int[] arr4 = {4,5,6};

        for (int k = 0; k < arr3.length; k++) {
            arr3[k] = arr4[k];
        }

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        System.out.println(arr3);
        System.out.println(arr4);

        arr3[0] = 100;

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));






    }
}
