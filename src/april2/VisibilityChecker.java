package april2;

import april1.Loan;

import javax.security.auth.login.AccountException;

public class VisibilityChecker {

    public static void main(String[] args) {


        Loan loan = new Loan();
        System.out.println(loan.amount);
      //  System.out.println(loan.months); //'months' is not public in 'april1.Loan'. Cannot be accessed from outside package
        loan.getAmount();
      //  loan.getMonths(); //getMonths()' is not public in 'april1.Loan'. Cannot be accessed from outside package

        //Account account = new Account();
    }
}
