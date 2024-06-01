package april22;

import java.time.LocalDate;

public class PolymorphismDemo {


    public static void main(String[] args) {


//        Object str = new String();
//        Object o =  new StringBuilder();

        Object obj = new Student("Jack Ma",
                55,
                LocalDate.of(1977, 3, 8));


        System.out.println(obj.toString());
        //Which toString is called?
        // It is determined by the actual type (actual object)
       // Dynamic binding (Late binding, run-time polymorphism, method overriding)
       // Static binding (Early binding, compile-time polymorphism, method overloading)




    }
}
