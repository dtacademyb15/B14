package day11;

public class LoopsInMethods {


    public static void main(String[] args) {


        printRandomChar(20);
    }


    public static void printRandomChar(int howManyTimes){

        int i = 0;
        while(i < howManyTimes){
            char ch = (char)(Math.random()*26+'a');
            System.out.print(ch);
            i++;
        }


    }




}
