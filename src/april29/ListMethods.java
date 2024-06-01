package april29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);

        List<Integer> firstThree = list.subList(0, 3); // sublist returns unmodifiable list
        System.out.println(firstThree);
        List<Integer> lastThree = list.subList(list.size()-3, list.size());
        System.out.println(lastThree);

        //Convert unmodifiable list to modifiable by creating a copy
        ArrayList<Integer> firstThreeModifiable = new ArrayList<>(firstThree);
        firstThreeModifiable.addAll(lastThree);
        System.out.println(firstThreeModifiable);

        // Convert array to ArrayList
        String[] names = {"Alice", "Bob", "Charlie"};
        List<String> converted = Arrays.asList(names);

        Integer[] ints = {1,2,4};
        List<Integer> list1 = Arrays.asList(ints);

        // Convert ArrayList to an array
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Object[] array = list2.toArray();
        Integer[] array2 = list2.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));


        // List.of() and Arrays.asList() return unmodifiable lists

        List<String> hello = List.of("hello", "world");
//        hello.add("bye");

        //If you need modifeable version of List,
        // either create a new ArrayList and pass it into the constructor

        List<Integer> list4 = new ArrayList<>(List.of(1,2,3,5));
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,6));

        List<String> strings = new ArrayList<>(hello);
        strings.add("bye");
        System.out.println(strings);

        //
        // or create the list the usual way and call add method



    }
}
