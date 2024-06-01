package april8;

public class AutoboxandUnbox {


    public static void main(String[] args) {


        int i = 89;

        Integer i2 = i; // autoboxing -> new Integer(i)
        Integer i3 = 45; // new Integer(45)

        Integer intObject = Integer.valueOf(78);
        int i4 = intObject; // autounboxing -> new Integer(78) -> 78
//        int i5 = new Integer(78);



        double d = 89; // this assignment works with primitives
        long l4 = 9;
        //this assignment does not work with wrappers since autoboxing creates a different object
       // Double d2 = 89; //  Double d2 = new Integer(89);

        //Invalid
//        Long l3 =  9;
//        Float f=  8.8;
//        Byte b = 130;
//        Short sh = 33000;

    }
}
