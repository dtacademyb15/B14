package may8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {


        List<Integer> integers = new ArrayList<>(List.of(2, 5, 2, 3, 6, 7, 2));


        Collections.sort(integers);

        System.out.println(integers);


        List<Employee> employees = new ArrayList<>(Arrays.asList(
           new Employee("Bob", 78, 200000),
           new Employee("Alice", 32, 150000),
           new Employee("Chuck", 54, 180000),
           new Employee("Zach", 23, 100000)
        ));



        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Bob", 78, 12),
                new Student("Alice", 32, 1),
                new Student("Chuck", 54, 34),
                new Student("Zach", 23, 54)
        ));

//       AgeComparator ageComparator = new AgeComparator();

//       Collections.sort(students, ageComparator);
       Collections.sort(students, new NameComparator());

        System.out.println("_---------------------------_");

        for (Student student : students) {
            System.out.println(student);
        }





    }
}
