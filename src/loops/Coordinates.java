package loops;

public class Coordinates {


    public static void main(String[] args) {


       OUTER: for (int i = 0; i <=5 ; i++) {

        for (int j = 0; j <=5 ; j++) {
                if(j==3){
                    continue OUTER;
                }
                System.out.print("(" + i + ", " + j + ") ");

            }
            System.out.println();
        }
        
        
    }
}
