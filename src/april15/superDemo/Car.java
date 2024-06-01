package april15.superDemo;

public class Car extends Vehicle{


    private String vin;
    private String type;

//    public Car(String make, String model, int year, String vin, String type) {
////        this.make = make;// this does not work because make is private in Vehicle
////        setMake(make); // we could use setters for initializing the super class's private fields
////        setModel(model);
////        setYear(year);
//
//       // this(); // thus() and super() cannot come in the same constructor
////        super(make, model, year); // super() is normally used to initialize super class's fields
//        //super has the same rule as this(), it needs to be the first line in the constructor
//        this.vin = vin;
//        this.type = type;
//    }


    public Car(String make, String model, int year, String vin, String type) {
        super(make, model, year);
        this.vin = vin;
        this.type = type;
    }

    public Car(){}



}
