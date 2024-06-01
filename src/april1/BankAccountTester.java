package april1;

public class BankAccountTester {


    public static void main(String[] args) {



        BankAccount bankAccount = new BankAccount(200, "Bob Dole", 21355215,322537126);

        System.out.println(bankAccount.getBalance());

        bankAccount.setOwnerName("Bobby Dole");

        System.out.println(bankAccount.getOwnerName());


    }
}
