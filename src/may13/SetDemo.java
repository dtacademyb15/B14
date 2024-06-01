package may13;

import java.util.*;

public class SetDemo {


    public static void main(String[] args) {

        Set<Integer> ids = new HashSet<>(); //insertion order NOT kept

        ids.add(123);
        ids.add(124);
        ids.add(125);
        ids.add(126);
        ids.add(127);
        ids.add(1);
        ids.add(99);
        ids.add(0);
        ids.add(493);
        ids.add(123);

        System.out.println(ids.add(222));
        System.out.println(ids.add(124));

        System.out.println(ids);

        ids.add(null); //hashset can contain null

        System.out.println(ids);

        //any method that requires an index is not supported by sets

//        ids.get(1);
//        ids.set(1, 34);
//        ids.remove(3);

        //How to iterate

//        for (Integer id : ids) {
//            System.out.println(id);
//        }

//        ids.forEach( s -> System.out.println(s));

        // Iterator

        Iterator<Integer> iteratorObject = ids.iterator();

//        Integer next = iteratorObject.next();
//        System.out.println(next);
//
//        System.out.println(iteratorObject.next());

        while(iteratorObject.hasNext()){
            System.out.println(iteratorObject.next());
        }

        // Set.of()
        Set<Integer> integers = Set.of(23, 4, 2, 34, 3, 5);
        System.out.println(integers);

        //[23, 4, 2, 34, 3, 5, 23,4,2,33,3] ->

        //  Convert list to set to remove duplicates
        List<Integer> integerList = new ArrayList<>(Arrays.asList(23, 4, 2, 34, 3, 5, 23,4,2,33,3));
        Set<Integer> uniqueItems = new HashSet<>(integerList);

        System.out.println(integerList);
        System.out.println(uniqueItems);

        //Convert set to list

        List<Integer> uniqueItemsList = new ArrayList<>(uniqueItems);
        System.out.println(uniqueItemsList);

        Set<String> alice = Set.of("Alice", "alice", "john", "John");

        Set<String> alice2 = new HashSet<>();
        alice.forEach(s -> alice2.add(s.toLowerCase()));

        System.out.println(alice2);


        System.out.println(containsDuplicate(new int[] {1,2,1,3,4,5,6}));


        // Order of insertion is kept for LinkedHashSet

        Set<Character> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add('a');
        linkedHashSet.add('b');
        linkedHashSet.add('c');
        linkedHashSet.add('s');
        linkedHashSet.add('x');
        linkedHashSet.add('a');

        System.out.println(linkedHashSet);

        // aaaaaddddggssxxz -> adgsxz
        System.out.println(removeDuplicates("aaaaaddddggssxxz"));

        // TreeSet

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(21);
        treeSet.add(1);
        System.out.println(treeSet);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(54);
        treeSet.add(0);
        treeSet.add(21);
        treeSet.add(null); //TreeSet does not allow null values due to sorting

        System.out.println(treeSet);

    }


    public static boolean containsDuplicate(int[] arr){


        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if(!set.add(i)){ //not unique
               return true;
            }

        }


        return false;
    }

   // aaaaaddddggssxxz -> adgxz
    public static String removeDuplicates(String str){


        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray() ) {
           set.add(ch);
        }

        StringBuilder sb = new StringBuilder();

        for (Character c : set) {
           sb.append(c);
        }

        return sb.toString();


    }

}
