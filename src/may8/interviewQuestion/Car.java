package may8.interviewQuestion;

import java.util.*;

public class Car {
    // implement the class
    private String make;
    private String model;

    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}


class Main {
    public static void main(String[] args) {

        // Create a list of 20 Cars with random  makes and models,year,

        List<Car> cars =  new ArrayList<>();

        List<String> models = List.of("Pilot", "Corolla", "Highlander", "Model 3", "Model Y", "Accord", "Camry");
        List<String> makes = List.of("Honda", "Toyota", "Tesla");


        for (int i = 0; i < 20; i++) {
            cars.add( new Car(makes.get(new Random().nextInt(makes.size())) ,
                    models.get(new Random().nextInt(models.size())) ,
                    1990 + new Random().nextInt(34) ));
        }


        cars.forEach( car -> System.out.println(car));

        System.out.println("Car with the newest year: " +  getTheCarWithTheNewestYear(cars));
        System.out.println("Car with the oldest year: " +  getTheCarWithTheOldestYear(cars));

    }


    public static Car getTheCarWithTheNewestYear(List<Car> cars){
        Collections.sort(cars, Comparator.comparing(Car::getYear));
//        Collections.sort(cars, (x,y) -> x.getYear() - y.getYear());
        return cars.get(cars.size()-1);
    }
    public static Car getTheCarWithTheOldestYear(List<Car> cars){
        Collections.sort(cars, Comparator.comparing(Car::getYear));
        return cars.get(0);
    }
}

