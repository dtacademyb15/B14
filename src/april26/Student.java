package april26;

import java.time.LocalDate;
import java.util.Objects;

public class Student {


    //POJO -> plain old java object
    // standard java class that models real world object
    // other names: Model, Entity, Bean
    // It should contain fields, constructor(all-args, no arg), getters,setters, toString(), equals() and hashcode()
    private long id;
    private String name;

    private LocalDate dob;

    private double gpa;

    public Student(long id, String name, LocalDate dob, double gpa) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gpa = gpa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object other){

        if(this == other) return true;
        if(other == null || this.getClass() != other.getClass()) return false;

       Student otherStudent = (Student)other;
       return this.id == otherStudent.id &&
               Objects.equals(this.name, otherStudent.name) &&
               Objects.equals(this.dob, otherStudent.dob) &&
               Double.compare(this.gpa, otherStudent.gpa)==0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, dob, gpa);
    }

    public static void main(String[] args) {

        Student student1 = new Student(12, "John Doe", LocalDate.of(1999,4,12), 3.87);
        Student student2 = new Student(11, "John csd", LocalDate.of(1999,2,12), 3.8);
        System.out.println(student1.equals(student2));

    }

}
