package march25;

public class TestCar {


    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.model);


        Car car1 = new Car();
        car1.make = "Tesla";
        car1.model = "Cyber Truck";
        System.out.println(car1.make);
        System.out.println(car1.model);
    }
}
