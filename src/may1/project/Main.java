package may1.project;

public class Main {

    public static void main(String[] args) {


        ReservationManager reservationManager = new ReservationManager();

        reservationManager.addTables(new IndoorTable(5));
        reservationManager.addTables(new IndoorTable(8));
        reservationManager.addTables( new IndoorTable(6));
        reservationManager.addTables( new IndoorTable(4));
        reservationManager.addTables(new OutdoorTable(6));
        reservationManager.addTables( new OutdoorTable(8));
        reservationManager.addTables(new PrivateRoom(8));


        reservationManager.displayAllTables();



    }
}
