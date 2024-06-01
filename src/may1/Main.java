package may1;

import java.util.List;

public class Main {


    public static void main(String[] args) {

       // Edible edible =  new Edible();

        Edible edible = new Apple();

        List<Edible> edibles =
                List.of(new Apple(), new Orange(), new Chicken());

        for (Edible each : edibles) {
            each.howToEat();
















        }

        System.out.println(Edible.MAX_COUNT);

    }
}
