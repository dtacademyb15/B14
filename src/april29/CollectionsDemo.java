package april29;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {


    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>(List.of(3,6,3,4,7, 3, 6, 5, 4, 3, 2, 1));

        Collections.sort(integers); //ascending
//        Collections.sort(integers, Comparator.reverseOrder()); //descending
//        Collections.reverse(integers);

        System.out.println(integers);

        int searchedValuesIndex = Collections.binarySearch(integers,1);

        System.out.println(searchedValuesIndex);


       Collections.shuffle(integers);

        System.out.println(integers);

        Integer min = Collections.min(integers);
        Integer max = Collections.max(integers);

        System.out.println(min);
        System.out.println(max);

        int frequencyOf3 = Collections.frequency(integers, 3);
        System.out.println(frequencyOf3);

        List<String> list = Collections.nCopies(1000000, "hello");
        System.out.println(list);

//        String word = "a".repeat(256);
//        System.out.println(word);



    }
}
