package may17;

import java.util.*;

public class MapDemo {


    public static void main(String[] args) {


        List<String> customers =  List.of("John Doe", "Alice Smith", "John Doe");


        // 1=John Doe, 2=Alice Smith 3=John Doe

        Map<Integer, String> customerMap =  new HashMap<>(); // does not keep the insertion order
//        Map<Integer, String> customerMap =  new LinkedHashMap<>(); // keeps the insertion order
//        Map<Integer, String> customerMap =  new TreeMap<>(); // sorts by the key of the entries

        //add an entry
        customerMap.put(99, "John Smith");
        customerMap.put(66, "David Duchovny");
        customerMap.put(33, "Fox Mulder");
        customerMap.put(1, "John Doe");
        customerMap.put(2, "Alice Smith");
        customerMap.put(3, "John Doe");
        customerMap.put(4, "John Doe");

        System.out.println(customerMap);


        //retrieve a value by its key
        String value = customerMap.get(33);

        System.out.println(value);

        // the keys are unique, adding a key with a diff value results in overwriting of the value
        customerMap.put(33, "Alice Scully"); // replaces the 33 key's value with the new value

        System.out.println(customerMap);


        customerMap.put(null, "Joe Schmo"); // HashMap and LinkedHashMap null key is allowed
        customerMap.put(null, "Joe Schmo"); // TreeMap null key is not allowed (throws an exception)
        customerMap.put(88, null); // as many null values are possible
        customerMap.put(89, null); //

        System.out.println(customerMap);


    }
}
