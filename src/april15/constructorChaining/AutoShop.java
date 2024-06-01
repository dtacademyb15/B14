package april15.constructorChaining;

public class AutoShop extends Shop{

    boolean zoneRequirements;
    String recyclingCenter;


    public AutoShop(String location, String rentalAgency, boolean zoneRequirements, String recyclingCenter) {
        super(location, rentalAgency);
        this.zoneRequirements = zoneRequirements;
        this.recyclingCenter = recyclingCenter;
    }

    @Override
    public String toString() {
        return "AutoShop{" +
                "zoneRequirements=" + zoneRequirements +
                ", recyclingCenter='" + recyclingCenter + '\'' +
                "} " + super.toString();
    }

    public static void main(String[] args) {

        System.out.println( new AutoShop(
                "Fairfax, VA",
                "PropertManagementCOM",
                true,
                "Fairfax recycling").toString());
    }
}
