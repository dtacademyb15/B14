package may1;

public  interface Edible {

//    public static final int MAX_COUNT = 100;
    int MAX_COUNT = 100;
    public abstract void howToEat();

    default void consume(){
        System.out.println("Some impl");
        String password = helperMethod();

    }


    public static String helperMethod(){
        //static methods with implementation were also added in Java 8.
        return "cds";
    }

    public default void myMethod(){
        //default method is a method with implementation in interfaces only
    }
}
