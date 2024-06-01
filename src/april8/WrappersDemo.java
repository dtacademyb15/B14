package april8;

import java.util.List;

public class WrappersDemo {

    public static void main(String[] args) {


        boolean b = true;
        Boolean b2 = true;

        Integer i = 89;

        //Collections use Classes as their contents

        int[] arr;
        Integer[] arr2;

        List<Integer> integers;

//        Integer intObj =  new Integer(23);
        Integer intObj2 =  23; // new Integer(23)

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);


        // 2147483641 -> 1463847412
        // 2147483647 -> 7463847412

        Integer someInt = 89;
        double d = someInt.doubleValue();
        System.out.println(d);

        //These classes are mainly used for their static utility methods valueOf() and parseType()

        //Convert String to the corresponding type

        String price = "67.47";

        // String to primitive
        double primitiveDoublePrice = Double.parseDouble(price);
        System.out.println(primitiveDoublePrice * 0.06);

        //String to object
        Double priceAsDoubleObject = Double.valueOf(price);
        System.out.println(priceAsDoubleObject * 0.06);



        // NumberFormatException

//        System.out.println(Integer.parseInt("23.78"));
//        System.out.println(Integer.valueOf("$78"));
        System.out.println(Double.parseDouble("78"));
//        System.out.println(Byte.parseByte("128"));

        // Explicit Object
        Integer someInt2 = Integer.valueOf(34);


    }
}
