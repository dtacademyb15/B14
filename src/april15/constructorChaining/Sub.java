package april15.constructorChaining;

public class Sub extends Super{


    public Sub(){
        // super(); // if a constructor does not explicitly add super() or this() call, then java inserts an implicit call to super's noarg constructor -> super();
        System.out.println("Sub's constructor");
    }

    public static void main(String[] args) {

        Sub sub = new Sub();
    }

}
