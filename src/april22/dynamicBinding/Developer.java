package april22.dynamicBinding;

public class Developer extends Employee{

    public String name = "Jack Sparrow";
    public double salary = 150000;



    public void getPaid(){
        System.out.println("Getting paid " + salary + " bonus: 10K" );
    }

    private void createID(){
        System.out.println("Dev ID");
    }



}
