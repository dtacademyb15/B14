package may24;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {


    public static void main(String[] args) {




        List<String> firstSt =  List.of("1", "Bob" , "Dole");
        List<String> secondSt =  List.of("2", "Alice" , "Smith");
        List<String> thirdSt =  List.of("3", "Jane" , "Eyre");

        List<List<String>> list = List.of(firstSt, secondSt,thirdSt);

        System.out.println(list);

        List<String> stringList = list.get(1);

        String firstNameOfThird = list.get(2).get(1);

        System.out.println(firstNameOfThird);



    }
}
