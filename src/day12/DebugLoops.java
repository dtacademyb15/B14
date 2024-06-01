package day12;

public class DebugLoops {


    public static void main(String[] args) {




//        String letters = "";
//
//        while (letters.length() != 2)
//            letters += "a";
//
//        System.out.println(letters);


//        int m = 9, n = 1, x = 0;
//        while(m > n){
//            m--;
//            n += 2;
//            x += m + n;
//        }
//        System.out.println(x);

        System.out.println("Main method 1");
        System.out.println("Main method 2");


        printMessage("Loops are powerful", 7);
    }


    public static void printMessage(String message, int times){
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
