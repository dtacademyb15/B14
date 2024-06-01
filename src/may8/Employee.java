package may8;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public int compareTo(Employee o) {
//        if(this.getAge() > o.getAge()){
//            return 1;
//        } else if (this.getAge() < o.getAge()) {
//           return -1;
//        }else{
//            return 0;
//        }

//        return this.getAge() - o.getAge();
//        return Integer.compare(this.getAge(), o.getAge());
//        return this.getName().compareTo(o.getName());
        return Double.compare(this.getSalary(), o.getSalary());

    }
}
