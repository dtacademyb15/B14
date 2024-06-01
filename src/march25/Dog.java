package march25;

public class Dog {

    String name;
    String breed;

    public static void main(String[] args) {

        Dog dog, doge;
        dog = new Dog();
        doge =  new Dog();
    }


    public void makeNoise(){
        System.out.println(name + " the " + breed + " says woof");
    }
}

class Tester{

    public static void main(String[] args) {
        Dog dog =  new Dog();
        dog.name = "Rex";
        dog.breed = "German Shepherd";

        dog.makeNoise();
    }

}
