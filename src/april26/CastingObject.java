package april26;

import java.time.LocalDate;

public class CastingObject {


    public static void main(String[] args) {


     //   Upcasting -> automatic conversion of smaller type to a larger type

        int num = 67;
        double d =  (double) num;
        double d1 =  (double)56;
        System.out.println(d);

        // Downcasting -> explicit conversion of larger type to a smaller type
        int num2 = (int)67.8;


     // Objects

     Object obj =  new String("java");
//     Object obj =  (Object) new String("java"); // implicit upcasting of String to Object

     String str =  new String();
     Object obj2 = (Object) str;  //reference assignment

     Animal animal = new Dog();


 //   Downcasting

   Animal anotherAnimal = new Dog();
   anotherAnimal.makeNoise();


   Dog anotherDog = (Dog) anotherAnimal; // explicit downcasting
   anotherDog.scratchWithFeet();

   ((Dog)anotherAnimal).scratchWithFeet();

// When casting we need to be careful
        // Common mistake is casting of incompatible types
        // Which results in class cast exception

   //Dog dog = (Dog) new Animal(); //

//    Animal yetAnotherAnimal =  new Dog();
//    Dog dog2 =  (Dog) yetAnotherAnimal;

//        Animal yetAnotherAnimal =  new Cat();
//        Dog dog2 =  (Dog) yetAnotherAnimal;


    Object[] customerInfo = {
            "John", "Doe", 21, LocalDate.of(1999, 3,12)
    } ;

    Object firstName = customerInfo[0];

    System.out.println(((String)firstName).substring(2));
    System.out.println(((String)customerInfo[0]).substring(2));

    // instanceof is used to check if an object/reference is compatible with certain class for casting
    // reference instanceof ClassName
   Object thirdElement = customerInfo[2];

   if(thirdElement instanceof String) {
        System.out.println(((String)thirdElement).substring(2));
   }

//

        for (Object o : customerInfo) {
            if( o  instanceof String)
            System.out.println(((String)o).toUpperCase());
        }









    }
}
