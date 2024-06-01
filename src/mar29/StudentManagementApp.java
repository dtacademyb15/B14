package mar29;


public class StudentManagementApp {


    public static void main(String[] args) {


        DuotechStudent duotechStudent1 = new DuotechStudent(10, "Kenan", "VA", true);
        DuotechStudent duotechStudent2 = new DuotechStudent(11, "Yana", "NY", true);
        DuotechStudent duotechStudent3 = new DuotechStudent(12, "Rustam", "FL", false);
        DuotechStudent duotechStudent4 = new DuotechStudent(13, "Syeda", "CA", true);
        System.out.println(DuotechStudent.countOfStudents);


        // Instance variables -> objName.varName
        duotechStudent1.id = 100;

        System.out.println(duotechStudent1.getInfo());
        System.out.println(duotechStudent2.getInfo());

        // Static variables -> ClassName.varName
        System.out.println(DuotechStudent.SCHOOL_NAME);
//        Math.random();
//        System.out.println(Math.PI);

        DuotechStudent.SCHOOL_NAME = "DuotechSchool";

        // Java allows static variables/methods to be accessed with an object
        System.out.println(duotechStudent1.SCHOOL_NAME);

        duotechStudent1.state = "NY";

        System.out.println(duotechStudent1.getInfo());
        System.out.println(duotechStudent4.getInfo());

        duotechStudent1.SCHOOL_NAME = "DTSchool";

        System.out.println(duotechStudent1.SCHOOL_NAME);
        System.out.println(duotechStudent4.SCHOOL_NAME);















    }
}
