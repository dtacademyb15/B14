package april15.demo;

public class ParkManagementApp {


    public static void main(String[] args) {


        Deer deer = new Deer();
        deer.setWeight(23.5);
        deer.setAge(5);
        System.out.println(deer.weight);
        System.out.println(deer.getAge());

        Wolf wolf = new Wolf();
        System.out.println(wolf.getWeight());


    }
}
