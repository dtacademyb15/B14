package may17;

import java.util.*;

public class MapDemo2 {


    public static void main(String[] args) {



        Map<String, String> books =  new HashMap<>();

        books.put("32v4324324vbcb", "War and Peace");
        books.put("b34v23v432v43v", "The lord of the Rings");
        books.put("vvghcchgc234324", "Trial");
        books.put("HVVj434344343", "Java Advanced");
        books.put("432b4v3v2cc432", "The Sun Also Rises");
        books.put("v23443vgvgv324", "1984");
        System.out.println(books.put("h43432gh32g4g3", "Thus Spoke Zarathustra")); //returns null because the key doesn't exist
        System.out.println(books.put("h43432gh32g4g3", "Thunder")); //returns the old value(Thus Spoke Zarathustra) for the key

        System.out.println(books);


        Map<String, String> books2 =  new HashMap<>();
        books.put("32423b32v4324", "Fahrenheit 451");
        books.put("342b4234nb2423", "I Robot");

        books.putAll(books2);



        System.out.println(books);

        String value = books.remove("h43432gh32g4g3"); // removes the entry with this key and returns the value
        boolean isRemoved = books.remove("h43432gh32g4g3", "Thunder"); // removes the entry with key and value
        System.out.println(isRemoved);

//        books.clear();

        System.out.println(books);


        if(!books.containsKey("342b4234nb2423")){
           books.put("342b4234nb2423","Zero");
        }

        System.out.println(books.containsValue("Fahrenheit 451"));
        System.out.println(books);
        System.out.println(books.size());
        System.out.println(books.isEmpty());



// keys can be obtained as a set
        Set<String> isbns = books.keySet();
        System.out.println(isbns);

 // values can also be obtained separately
        Collection<String> titles = books.values();
       // List<String> titlesAsList = (List<String>)titles; //
        System.out.println(titles);


  // key-value pair collection can be obtained

        Set<Map.Entry<String, String>> entries = books.entrySet();

        for (Map.Entry<String, String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase()); //update all values to uppercase
        }

  // iterate through the map using set of entries

//


        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


//        List.of();
//        Set.of();
        Map<Integer, String> integerStringMap = Map.of(1, "A", 2, "B", 3, "B");
        System.out.println(integerStringMap);


        integerStringMap.forEach( (k,v) -> System.out.println(k + " : " + v) );


        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.putIfAbsent("apple", 20); // will not overwrite the value
        map.putIfAbsent("banana", 20);
        System.out.println(map); // Outputs: {banana=20,apple=10}


//        Integer appleValue = map.get("apple1");
        Integer appleValue = map.getOrDefault("apple1", 0);
        System.out.println(appleValue.doubleValue());




       // Hashtable<String, Integer> map1 = new Hashtable<>();
        // legacy class that was replaced by HashMap
        // synchronized, slow






    }
}
