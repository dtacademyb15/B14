package april15.protectedDemo;

public class Employee {

    //classes can only have public or default  visibility
    // they can't be protected or private

    protected Employee(){ // constructors can be protected

    }

    // private -> default -> protected -> public
    private String name;
    String title; // default (package private) -> visible only in the current package
    protected int experience; // visible in the current package and subclasses outside the package
    // protected -> intended for use by subclasses in the same package or outside the package

    public double salary; //public


    protected void forSubclass(){

    }


}
