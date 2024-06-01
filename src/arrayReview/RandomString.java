package arrayReview;

public class RandomString {

    public static void main(String[] args) {



        String collect = "";

        for (int i = 0; i < 5; i++) {
            collect+=(char)(Math.random()*26+'a');
        }

        System.out.println(collect);






    }







}
