package loops;

public class NestedLoopAlgorithm {

    public static void main(String[] args) {



        String str = "Hello World";

        // For each char print the rest of the chars

//        for (int i = 0; i < str.length()-1; i++) {
//
//            System.out.print(str.charAt(i) + " -> ");
//            for (int j = i + 1; j < str.length() ; j++) {
//
//                System.out.print(str.charAt(j) + " ");
//            }
//            System.out.println();
//
//        }

        for (int i = 0; i < str.length()-1; i++) {


            for (int j = i + 1; j < str.length() ; j++) {
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println("Found the duplicate: " + str.charAt(i));
                }

            }


        }





    }
}
