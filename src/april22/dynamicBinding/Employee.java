package april22.dynamicBinding;

public class Employee {

    public String name = "John Doe";
    public double salary = 80000;

    public void getPaid(double bonus){
        System.out.println("Getting paid " + salary + bonus);
    }

    public void getPaid(){
        System.out.println("Getting paid " + salary);
    }

    private void createID(){
        System.out.println("Employee ID");
    }

    public static void main(String[] args) {

        Employee employee = new Developer();
        System.out.println(employee.salary); //static binding example
        //Static binding - determination based on Declared type (type of the reference)
        // variables, overloaded methods, private methods, final methods, static methods are determinde by static binding

        employee.getPaid(32000); // static binding - overloaded methods are determined during compilation

        employee.getPaid(); //dynamic binding example
        // Dynamic Binding - determination based on Actual type (type of the actual object)
        // Overridden methods are determined by dynamic binding


        employee.createID(); //static binding example


//        Difference between static vs dynamic binding?
//        Difference between compile-time vs runtime polymorphism?
        // Method overloading vs Method overriding
    }

}
