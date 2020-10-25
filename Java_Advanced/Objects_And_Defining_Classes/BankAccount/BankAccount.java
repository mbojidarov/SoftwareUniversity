package BankAccount;

public class BankAccount {
    private static int startingIDvalue = 1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;

//    private double interest;

    public BankAccount() {
        this.id = startingIDvalue++;

//        this.interest = interestRate;
    }

    public void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;  //nqma this.interest za static members
    }

    public double getInterestRate(int years) {
        return this.balance * years * interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
