package april15.demo;

public class DogTester {


    public static void main(String[] args) {



        Dog dog = new Dog();
        System.out.println(dog.olfactorySense);
        System.out.println(dog.getOlfactorySense());
        System.out.println(dog.getAge());
        System.out.println(dog.weight);


        ServiceDog serviceDog = new ServiceDog();

        System.out.println(serviceDog.assignedPerson); // ServiceDog property
        System.out.println(serviceDog.olfactorySense); // Dog property
        System.out.println(serviceDog.weight); // Animal property

        Table table = new Table();


        System.out.println(table.toString());
        System.out.println(table.equals(new Table()));

    }
}
