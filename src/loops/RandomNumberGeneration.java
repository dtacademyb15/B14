package loops;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGeneration {


    public static void main(String[] args) {


       int randNo =  (int)(Math.random()*25); // 0-24


       int randNo2 = new Random().nextInt(25); // 0-24

        int randNo3 = 50 + new Random().nextInt(51); // 50-100

        int randNo4 = ThreadLocalRandom.current().nextInt(25); // 0-24


    }
}
