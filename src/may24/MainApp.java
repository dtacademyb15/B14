package may24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainApp {

    public static void main(String[] args) throws IOException {

        List<List<String>> fileContent = CSVReader.readCsv("src/may24/students.csv");

        System.out.println(fileContent);

        // Create Student object of

        List<Student> students = new ArrayList<>();


        for (List<String> each : fileContent){
            Student st = new Student(
                    Integer.parseInt(each.get(0)),
                    each.get(1),
                    each.get(2),
                    each.get(3),
                    LocalDate.parse(each.get(4)),
                    each.get(5)
                    );

            students.add(st);

        }




        // Sort the students by last name

        Collections.sort(students, Comparator.comparing(Student::getLast));
        System.out.println("------------SORTED BY LAST NAME-----------------");
        students.forEach(System.out::println);

        // Sort the students by dob

//        Collections.sort(students, Comparator.comparing(Student::getDob));
        Collections.sort(students, Comparator.comparing(Student::getDob, Comparator.reverseOrder()));
        System.out.println("------------SORTED BY DOB-----------------");
        students.forEach(System.out::println);



        // Find 3 oldest students and store them in a file

        //sort them by dob
        Collections.sort(students, Comparator.comparing(Student::getDob));

        List<Student> oldestThree = students.subList(0,3);

        List<String> stringList = new ArrayList<>();

        for (Student student : oldestThree) {
            stringList.add(
                    student.getId()+"," +
                    student.getFirst()+"," +
                    student.getLast()+"," +
                    student.getEmail()+"," +
                    student.getDob().toString()+"," +
                    student.getSsn()

            );

        }

//        List<String> oldestThreeString = new ArrayList<>();
//        oldestThree.forEach( s -> oldestThreeString.add(s.toString()));

        Files.write(Path.of("src/may24/oldest3.csv"), stringList);









    }
}
