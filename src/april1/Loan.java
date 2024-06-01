package april1;



public class Loan {

    // Java supports 4 visibility -> public -> protected -> default -> private

    public double amount; // public  -> accessible everywhere
    int months; //default -> accessible only within the same package
    private double interestRate; //private - > accessible only within the class
    // according to encapsulation principle, all fields must be private


    public static void main(String[] args) {
        System.out.println(new Loan().interestRate); // inside the class anything is accessible
    }

// constructors can have all 4 visibilities
//     public Loan(){}


    public double getAmount(){
        return amount;
    }

    int getMonths(){
        return months;
    }

    //private methods are typically used for internal operations
    private double calculateMonthlyInterest(){
        return interestRate / 12;
    }

    public double calculateMonthlyInterestAmount(){
         return interestRate * calculateMonthlyInterest();
    }
}
