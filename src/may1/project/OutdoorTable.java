package may1.project;

public class OutdoorTable extends Table{


    public OutdoorTable(int capacity) {
        super(capacity);
    }

    @Override
    public boolean makeReservation(int partySize) {
        if(!isReserved() && partySize<=getCapacity()){
            System.out.println("Outdoor table is reserved");
            return true;

        }
        System.out.println("Outdoor table could not be reserved");
        return false;
    }

    @Override
    public boolean cancelReservation() {
        if(isReserved()){
            setReserved(false);
            System.out.println("Reservation is cancelled for Outdoor table.");
            return true;
        }
        System.out.println("There is no reservation for this Outdoor table");
        return false;
    }

    @Override
    public void checkStatus() {
        System.out.println( "Outdoor Table: " + (isReserved() ? "Reserved" : "Available"));
    }
}
