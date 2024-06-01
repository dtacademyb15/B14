package march25;

public class Student {

 // instance variables -> they represent object's properties/attributes
    // also known as Fields

    // instance -> object

  // instance variables are autoamtically initialized to default values when an object is created
    long id;
    String name;
    int age;


    // instance methods -  they represent object's behaviors

    public void submitAssignment(){
        System.out.println("Student " + name + " with an id  "+id+ " and age "+age+" has submitted the homework.");
    }




}
