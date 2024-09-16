package Practice2;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount() {
        name = null;
        balance = 0;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addInterest(int rate) {
        balance *= (1 + rate / 100.0);
    }

    public String toString() {
        return String.format("<BankAccount name=%s balance=%.2f>", name, balance);
    }
}