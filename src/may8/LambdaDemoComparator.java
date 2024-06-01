package may8;

import java.util.*;

public class LambdaDemoComparator {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Bob", 78, 12),
                new Student("Alice", 32, 1),
                new Student("Chuck", 54, 34),
                new Student("Zach", 23, 54)
        ));


//        Comparator<Student> myCustomComparator = new NameComparator();
//
//        Collections.sort(students, myCustomComparator);

//        Collections.sort(students, (Student o1, Student o2) -> { return o1.getName().compareTo(o2.getName());});

        Collections.sort(students, (x, y) ->  x.getName().compareTo(y.getName()) );


        System.out.println(students);

        Collections.sort(students, (x,y) -> x.getAge() - y.getAge());

        System.out.println(students);

        Collections.sort(students, (x,y) -> Long.compare(x.getId(), y.getId()) );

        // :: -> Method reference

        Collections.sort(students, Comparator.comparing(Student::getId));
        Collections.sort(students, Comparator.comparing(Student::getAge));

        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("-------------------");
        System.out.println(students);

        Collections.sort(students, Comparator.comparing(Student::getName, Comparator.reverseOrder()));

        System.out.println("-------------------");
        System.out.println(students);






    }
}
