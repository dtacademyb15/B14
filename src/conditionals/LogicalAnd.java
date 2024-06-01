package conditionals;

public class LogicalAnd {


    public static void main(String[] args) {

    int number = 157;

        if ( number >= 0 && number % 2 == 0 && number > 100){
            System.out.println("Positive");
            System.out.println("Even");
            System.out.println("Greater than 100");
        }


    }
}
