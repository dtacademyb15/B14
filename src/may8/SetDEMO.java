package may8;

import java.util.HashSet;
import java.util.Set;

public class SetDEMO {

    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();

        System.out.println(set.add(1));
        System.out.println(set.add(2));
        System.out.println(set);
        System.out.println(set.add(1));
    }
}
