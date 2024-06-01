package aarayOps;

public class ArrayInMethods {


    // Why is main method's parameter String[] ?
 // When you run java programs through command line,
    // you can pass optional string arguments (separated by space) and control how the java program is run
    // Those arguments will be passed into the main method as String[]


    public static void main(String[] args) {

//        int[] arr = {1,2,4,5};
        int[] arr = new int[]{1,2,4,5};

        int sum = sum(arr);

        System.out.println(sum);

        System.out.println(sum(new int[]{1,2,4,5,6}));
    }



    public static int sum(int[] arr){
        int sum = 0;
        for (int i : arr) {
           sum+=i;
        }
        return sum;
    }



    public static int[] get3Max(){

        int[] arr =  new int[3];
        // perform some logic

        return arr;
    }
}
