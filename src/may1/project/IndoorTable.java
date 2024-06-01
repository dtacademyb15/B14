package may1.project;

public class IndoorTable extends Table{


    public IndoorTable(int capacity) {
        super(capacity);
    }

    @Override
    public boolean makeReservation(int partySize) {
        if(!isReserved() && partySize<=getCapacity()){
            System.out.println("Indoor table is reserved");
            return true;

        }
        System.out.println("Indoor table could not be reserved");
        return false;
    }

    @Override
    public boolean cancelReservation() {
        if(isReserved()){
            setReserved(false);
            System.out.println("Reservation is cancelled for indoor table.");
            return true;
        }
        System.out.println("There is no reservation for this indoor table");
        return false;
    }

    @Override
    public void checkStatus() {
        System.out.println( "Indoor Table: " + (isReserved() ? "Reserved" : "Available"));
    }
}
