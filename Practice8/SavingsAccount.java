public class SavingsAccount {
    private static double annualInterestRate = 0;
    private double savingsBalance;

    public SavingsAccount() {
        savingsBalance = 0;
    }

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        double interest = savingsBalance * annualInterestRate / 12;
        savingsBalance += interest;
        return interest;
    }

    public static void modifyInterestRate(int annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate / 100.0;
    }
}

class SavingsAccountTester {
    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount(2000.00);
        SavingsAccount b = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(4);

        System.out.printf("Balance 1: %.2f%n", a.calculateMonthlyInterest());
        System.out.printf("Balance 2: %.2f%n", b.calculateMonthlyInterest());

        SavingsAccount.modifyInterestRate(5);
    }
}