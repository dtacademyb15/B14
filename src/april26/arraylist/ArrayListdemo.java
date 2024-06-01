package april26.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListdemo {


    public static void main(String[] args) {


//        ArrayList<Integer> list = new ArrayList<Integer>(); //uncommon but valid

//        ArrayList<Integer> list = new ArrayList<>();

   //     ArrayList arrayList = new ArrayList(); // uncommon but valid

        List<Integer> list = new ArrayList<>();
        // Collections including List do not support primitives
//        List<int> list2 = new ArrayList<>();

        list.add(34);
        list.add(12);
        list.add(55);
        list.add(null);

        for (int i : list) {
            System.out.println(i);
        }


        System.out.println(list);

        // Very useful constructor
        ArrayList<Integer> integers = new ArrayList<>(list);
        System.out.println(integers);


        // Arraylist of 100 random numbers

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            nums.add(new Random().nextInt(1000));
        }

        System.out.println(nums);

        System.out.println(list);

        list.add(1, 99);

        System.out.println(list);

//        list.clear();

        System.out.println(list);

        Integer first = list.get(0);// equivalent arr[0]
        System.out.println(first);

        int size = list.size();
        System.out.println(size);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer each: list){
            System.out.println(each);
        }

        list.set(2, 120);
        System.out.println(list);

        // iterate and update each element by multiplying them by 10


        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 10 ); /// arr[i] = arr[i] * 10
        }

        System.out.println(list);

        //Remove

        list.remove(3);

        System.out.println(list);

        list.add(1, 3);

        System.out.println(list);

//        list.remove(3); // element at index 3
        System.out.println(list.remove(Integer.valueOf(3))); // element with value 3
        //returns true if removed, otherwise false
        System.out.println(list);
//
       // list.remove(990); //IndexOutOfBoundsException

        System.out.println(list);


        System.out.println(list.contains(990));
        System.out.println(list.contains(1000));

        System.out.println(list.indexOf(340));

        System.out.println(list.isEmpty());


    }
}
