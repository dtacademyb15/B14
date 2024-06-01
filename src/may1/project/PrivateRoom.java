package may1.project;

public class PrivateRoom extends Table{


    public PrivateRoom(int capacity) {
        super(capacity);
    }

    @Override
    public boolean makeReservation(int partySize) {
        if(!isReserved() && partySize<=getCapacity()){
            System.out.println("Private table is reserved");
            return true;

        }
        System.out.println("Private table could not be reserved");
        return false;
    }

    @Override
    public boolean cancelReservation() {
        if(isReserved()){
            setReserved(false);
            System.out.println("Reservation is cancelled for Private table.");
            return true;
        }
        System.out.println("There is no reservation for this Private table");
        return false;
    }

    @Override
    public void checkStatus() {
        System.out.println( "Private Table: " + (isReserved() ? "Reserved" : "Available"));
    }
}
