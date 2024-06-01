package mar29;

import java.util.Random;

public class Student {

    int id;
    String name;


    public Student(String name) {
        this.id = generateId();
        this.name = name;
    }


    public static void main(String[] args) {

        Student student1 = new Student("john");
        Student student2 = new Student("alice");

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        student1.capitalizeName();
        student2.capitalizeName();

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        int id1 = Student.generateId();


    }
    public void capitalizeName(){
      name =  name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public static int generateId(){
        int someID = new Random().nextInt(100000);
        return someID;
    }


    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
