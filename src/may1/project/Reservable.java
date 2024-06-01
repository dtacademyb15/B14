package may1.project;

public interface Reservable {

    boolean makeReservation(int partySize);
    boolean cancelReservation();
    void checkStatus();

}
