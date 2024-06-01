package may13;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

    public static void main(String[] args) {


        Queue<String> students = new PriorityQueue<>();

        students.offer("Bob");
        students.offer("Alex");
        students.offer("Alice");
        students.offer("Zach");
        students.offer("Yana");
        students.offer("Kenan");

        System.out.println(students);
        while(!students.isEmpty()){
            System.out.println(students.poll());
        }


        Queue<Student> studentQueue = new PriorityQueue<>(Comparator.comparing(Student::getName));

        studentQueue.offer(new Student(23, "Bob"));
        studentQueue.offer(new Student(1, "Alice"));
        studentQueue.offer(new Student(11, "Zach"));
        studentQueue.offer(new Student(5, "Yana"));

        while(!studentQueue.isEmpty()){
            System.out.println(studentQueue.poll());
        }










     }
}
