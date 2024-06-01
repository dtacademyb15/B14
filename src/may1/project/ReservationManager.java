package may1.project;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {


    List<Reservable> tables = new ArrayList<>();


    public void addTables(Reservable reservable){
        tables.add(reservable);
    }


    public void displayAllTables(){
        for (Reservable table : tables) {
            table.checkStatus();
        }
    }


}
