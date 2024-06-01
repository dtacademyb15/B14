package day11;

public class AccumulatingStrings {


    public static void main(String[] args) {


//        String str = "hello";
//        System.out.println(str.repeat(10));


        String repeated = myRepeat("x", 100000);

        System.out.println(repeated);


//        String randomPassword = getRandomChar(100);
//
//        System.out.println(randomPassword);
    }


    public static String myRepeat(String str, int times){

        int i = 0;
        String collect = "";
        while(i < times){
            collect = collect + str;
            i++;
        }

        return collect;

    }


    public static String getRandomChar(int howManyTimes){

        int i = 0;
        String str = ""; // accumulator variable that is initially empty
        while(i < howManyTimes){
            char ch = (char)(Math.random()*26+'a'); //single random char
            str = str + ch;
            i++;
            // return str; //common mistake
        }

        return str;


    }
}
