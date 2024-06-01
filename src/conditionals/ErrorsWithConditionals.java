package conditionals;

public class ErrorsWithConditionals {


    public static void main(String[] args) {



       int num = 6;


       boolean isEven = num % 2 == 0;


//       if (isEven == true){ // redundant checking of a boolean
//       if (isEven){
//           System.out.println("Even");
//       }else{
//           System.out.println("Odd");
//       }

        if (isEven = true){  // logical error = vs ==
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }








    }
}
