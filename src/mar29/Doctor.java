package mar29;

import javax.print.Doc;

public class Doctor {

    static int id;
    String name;
    String specialty;

    public static void Doctor(){
        System.out.println(id);
    }

    public static void main(String[] args) {

//        System.out.println(new Doctor(2).id);
    }


                  public Doctor(int id, String name, String specialty) {
        this();
        this.id = id;
        this.name = name;
        this.specialty = specialty;
    }

    public Doctor(){

    }

    public void doSomething(){
        System.out.println(this.id);
    }

    public static void doSomethingStatic(){
        System.out.println(new Doctor().id);
    }
}
