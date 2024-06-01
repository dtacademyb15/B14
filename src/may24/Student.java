package may24;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

    private Integer id;
    private String first;
    private String last;
    private String email;
    private LocalDate dob;
    private String ssn;


    public Student(Integer id, String first, String last, String email, LocalDate dob, String ssn) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.email = email;
        this.dob = dob;
        this.ssn = ssn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", ssn='" + ssn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(first, student.first) && Objects.equals(last, student.last) && Objects.equals(email, student.email) && Objects.equals(dob, student.dob) && Objects.equals(ssn, student.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first, last, email, dob, ssn);
    }
}
