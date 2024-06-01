package arrayReview;

import java.util.Arrays;

public class PassByValue {


    public static void main(String[] args) {

//        doSomething(20);

        int number = 30;

        doSomething(number);

        System.out.println("The number variable in main method: " + number);

        int[] arr = {1,2,3};

        changeArray(arr);

        System.out.println("The arr variable in main method: " + Arrays.toString(arr));


        String str = "Hello";

        changeString(str);

        System.out.println("The str variable in the main method: " + str);

        // Pass-by value -> it is a way that java uses to pass variables to a method.
        // Pass - by -value -> passing the value(copy) of the variable
        // Value(copy) for primitive is the actual value like 50, true, 's'
        // Value(copy) for an object is the copy of its reference which points to the same object

        //Primitives and Immutable Objects (e.g. String):  When Primitive variables and Immutable objects are passed, if the method changes the variable, they are not affected
        // Mutable Objects (e.g. array): When mutable objects are passed, if the method changes the object, they are affected, the change is visible in the callling method

        //

    }



    public static void changeArray(int[] another){
        for (int i = 0; i < another.length; i++) {
            another[i]*=10;
        }
        System.out.println("The another variable in my method: " + Arrays.toString(another));
    }



    public static void doSomething(int number){
        number= number * 100;
        System.out.println("The number variable inside the method: " + number);
    }


    public static void changeString(String str){
        str = str.toUpperCase();
        System.out.println("The str variable inside the method: " + str);
    }


}
