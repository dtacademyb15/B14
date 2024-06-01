package april1;

import mar29.practice.Main;

import java.sql.Array;
import java.util.Arrays;

public class VisibilityChecker {

    public static void main(String[] args) {


        Loan loan = new Loan();
        System.out.println(loan.amount);
        System.out.println(loan.months);
//        System.out.println(loan.interestRate);
        loan.getAmount();
        loan.getMonths();
//        loan.calculateInterest();

//        System.out.println(new Loan().interestRate);

//        Account account = new Account();

        Account.doSomethingAccountRelated();
        Account.doSomethingAccountRelated2();

//        Math math = new Math();
//        Arrays arrays = new Arrays();



    }
}
