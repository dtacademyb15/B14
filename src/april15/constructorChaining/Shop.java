package april15.constructorChaining;

public class Shop {

    String location;
    String rentalAgency;

    public Shop(String location, String rentalAgency) {
        this.location = location;
        this.rentalAgency = rentalAgency;
    }


    public String toString() {
        return "Shop{" +
                "location='" + location + '\'' +
                ", rentalAgency='" + rentalAgency + '\'' +
                '}';
    }
}
