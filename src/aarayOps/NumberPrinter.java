package aarayOps;

public class NumberPrinter {

    public static void main(String[] args) {


        if(args[0].equals("normal")){
            for (int i = 0; i < 100 ; i++) {
                System.out.print(i+ " ");
            }
        }else if(args[0].equals("reverse")){
            for (int i = 100; i >=0 ; i--) {
                System.out.print(i+ " ");
            }
        }



    }
}
