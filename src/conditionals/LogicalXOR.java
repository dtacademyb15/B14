package conditionals;

public class LogicalXOR {


    public static void main(String[] args) {



        // Check if number is not divisible by both 3 and 5
        int num = 15;

        if (num % 3 == 0 ^ num % 5 == 0){
            System.out.println("The number is divisible by either 3 or 5");
        }else{
            System.out.println("The number is not divisible by both 3 and 5");
        }



    }
}
