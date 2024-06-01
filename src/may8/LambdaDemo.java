package may8;

import java.util.*;

public class LambdaDemo {


    public static void main(String[] args) {


        List<Integer> list = List.of(3,5,2,3,5,7,3,4);

        list.forEach( s  ->  System.out.print(s) );
        list.forEach( s  ->  { if(s>5) System.out.print(s); } );

        list.forEach(System.out::println);

        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "Alex"));

//        names.removeIf( s -> s.startsWith("A"));
//        names.removeIf( s -> s.length()>=4 );

        System.out.println(names);

//        Collections.sort(names);
//
//        names.sort(Comparator.naturalOrder());
        names.sort(Comparator.reverseOrder());

        System.out.println(names);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        numbers.replaceAll( s -> s * 10);

        System.out.println(numbers);






    }
}
