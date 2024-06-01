package april22;

import java.time.LocalDate;

public class Student {

    private String name;
    private long id;

    private LocalDate dob;

    public Student(String name, long id, LocalDate dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                '}';
    }
}
