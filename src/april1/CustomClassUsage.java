package april1;

import java.util.Random;

public class CustomClassUsage {


    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount(300, "Alice Smith" , 213213,654334);
        getBankAccountDetails(bankAccount);

        getBankAccountDetails(new BankAccount(300, "Alice Smith" , 213213,654334));


        BankAccount randomBankAccount = getRandomBankAccount();
        System.out.println(randomBankAccount.toString());

    }



    public static void getBankAccountDetails(BankAccount bankAccount){
        System.out.println("Bank account details are the following:" + bankAccount.toString());

    }

    public static BankAccount getRandomBankAccount(){

        Random random = new Random();
        return new BankAccount(random.nextInt(2000), generateName(), random.nextInt(10000000),random.nextInt(1000000000));
    }

    public static String generateName(){
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str = "";
        for (int index = 0; index < 10; index++) {
            int randIndex = new Random().nextInt(alpha.length());
            str += alpha.charAt(randIndex);
        }


        return str;

    }

}
