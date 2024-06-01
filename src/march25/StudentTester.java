package march25;

public class StudentTester {

    public static void main(String[] args) {


       // Creating object in Java follows the followign syntax:
    //   Classname variableName = new Classname();

     Student student1 = new Student();

     // Access each object's instance variable and method
//        System.out.println(student1.id);
//        System.out.println(student1.name);
//        System.out.println(student1.age);

       student1.id = 123;
       student1.name = "John Doe";
       student1.age = 33;

       student1.submitAssignment();


     Student student2 = new Student();

        student2.id = 126;
        student2.name = "Alice Smith";
        student2.age = 27;

        student2.submitAssignment();



        Dog dog  = new Dog();

    }
}
