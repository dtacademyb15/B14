package april15.superDemo;

public class Tester {

    public static void main(String[] args) {


        Car car = new Car(
                "Toyota",
                "Supra",
                2023,
                "322vcgc",
                "sport");
//        car.setModel("Supra");
//        car.setMake("Toyota");
//        car.setYear(2023);

        System.out.println(car.getModel());
    }
}
