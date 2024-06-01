package april15.constructorChaining;


public class Engineer extends Employee {


    int years = 10;




    public void printRequiredYears(){
        System.out.println(years);//10
        System.out.println(this.years); //10
        System.out.println(super.years);//5
    }

    public static void main(String[] args) {

        new Engineer().printRequiredYears();
    }
}
