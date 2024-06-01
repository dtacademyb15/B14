package april15.constructorChaining;

public class Employee {

    int years = 5;
    public Employee(int years){
        this.years =years;
    }

    public Employee(){

    }

    @Override
    public String toString() {
        return "Employee{" +
                "years=" + years +
                '}';
    }
}
