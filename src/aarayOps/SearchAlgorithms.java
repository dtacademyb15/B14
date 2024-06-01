package aarayOps;

public class SearchAlgorithms {


    public static void main(String[] args) {

        int[] arr = {45,23,7,84,53,4,6,2,3,5,7,3,45,35,34,43,5,34,58,92};
        System.out.println(linearSearch(100, arr));



        int[] arr2 = {2,3,4,5,7,8,9,12,56,88,578};

        System.out.println(binarySearch(8, arr2));
    }



    public static int linearSearch(int key, int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }

        return -1;

    }




    public static int binarySearch(int key, int[] arr){

       int startIndex = 0;
       int endIndex = arr.length-1;

       while(endIndex >= startIndex){

           int midIndex = (startIndex+endIndex)/2;

           if(key < arr[midIndex] ){
               endIndex = midIndex-1;
           } else if (key > arr[midIndex]) {
               startIndex = midIndex+1;
           }else{
              return midIndex;
           }

       }


       return -1;


    }
}
