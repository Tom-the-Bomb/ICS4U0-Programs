package Practice2;

public class AccountTester {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Tara", 500);
        account.withdraw(500);
        account.deposit(1600);

        System.out.println("Balance before adding interest");
        System.out.printf("Name: %s, Balance: $%.2f%n%n", account.getName(), account.getBalance());

        account.addInterest(5);
        System.out.println("Balance after adding interest");
        System.out.printf("Name: %s, Balance: $%.2f%n%n", account.getName(), account.getBalance());

        BankAccount account2 = new BankAccount();
        account2.setName("Marya");
        account2.setBalance(2000);
        account2.deposit(620);
        account2.withdraw(450);

        System.out.println("Balance before adding interest");
        System.out.printf("Name: %s, Balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        account2.addInterest(5);
        System.out.println("Balance after adding interest");
        System.out.printf("Name: %s, Balance: $%.2f%n%n", account2.getName(), account2.getBalance());

    }
}
