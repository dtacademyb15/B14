package mar29;

public class DuotechStudent {

    // instance variables -> these properties are specific to each instance/object

    int id = 999;
    String name = "John";
    String state = "VA";

    boolean isOnline = true;

    static String SCHOOL_NAME;

    static int countOfStudents = 0;

    //Static variables are either initialized when declared or in a static block

    static {
        SCHOOL_NAME = "Duotech";
    }

    public static void updateName(String name){
        SCHOOL_NAME = name;
    }


    public void instanceMethod(){
        System.out.println(getInfo()); // instance method can call another instance method
        updateName("DT"); // instance method can call static method
        System.out.println(name); // instance method can access an instance variable
        System.out.println(SCHOOL_NAME); // instance method can access static variable
    }

    public static void staticMethod(){
//        System.out.println(getInfo()); // static method cannot call instance method
        updateName("DT"); // static method can call static method
//        System.out.println(name); // static method cannot access an instance variable
        System.out.println(SCHOOL_NAME); // static method can access static variable
    }


//    public static void main(String[] args) {
//        System.out.println(DuotechStudent.SCHOOL_NAME);
//        System.out.println(new DuotechStudent(12, "dsd", "ds", true).id);
//    }
    public DuotechStudent(int id, String name, String state, boolean isOnline) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.isOnline = isOnline;
        countOfStudents++;
    }

    public String getInfo() {
        return "DuotechStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
