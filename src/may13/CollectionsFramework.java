package may13;

import java.util.*;

public class CollectionsFramework {

    //

    public static void main(String[] args) {


      //Collections Framework -> java term that includes 4 main interfaces: List,Set,Queue,Map
      // Collection -> super interface of List Set and Queue
      // Collections -> utility class that has static methods to manipulate Collection interface objects like List,Set and Queue



        LinkedList<String> list = new LinkedList<>();
        List<String> list3 = new LinkedList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Jane");

        System.out.println(list);

        list.addFirst("Jack");

        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println(list);


        List<String> names = Arrays.asList("Alice", "Bob", "Chanelle");
        System.out.println(names.getClass());

        List<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(3);
        vector.add(4);
        System.out.println(vector);


        ArrayList<Integer> list4 = new ArrayList<>();
        System.out.println(list4.size());
        List<Integer> synchronizedList = Collections.synchronizedList(list4);


    }
}
