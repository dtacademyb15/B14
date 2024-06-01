package loops;

public class AmericanFlag {


    public static void main(String[] args) {




        for(int i = 1; i <= 13; i++){
            for(int j = 1; j <=50 ; j++){
                  if(i<=5 && j<=10){
                      System.out.print("* ");
                  }else{
                      System.out.print("==");
                  }
            }
            System.out.println();
        }

    }
}
