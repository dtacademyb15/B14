package april1;

public class BankAccount {



    // POJO -> Plain Old Java Object
    // Typical Java class with private fields, all-args constructor, public getter and setter methods and other standard methods (toString(), equals(), hashcode())


    // Encapsulation -> making the class fields private, and providing public getters and setters
    private double balance;
    private  String ownerName;
    private long accountNumber;
    private long routingNo;


    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }


    public long getRoutingNo() {
        return routingNo;
    }

    public void setRoutingNo(long routingNo) {
        this.routingNo = routingNo;
    }

    public BankAccount(double balance, String ownerName, long accountNumber, long routingNo) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.routingNo = routingNo;
    }



    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                ", accountNumber=" + accountNumber +
                ", routingNo=" + routingNo +
                '}';
    }
}
