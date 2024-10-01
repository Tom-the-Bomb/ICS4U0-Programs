package Practice4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("CS Card International Statement");
        System.out.println("===============================\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Previous Balance:\t$");
        double prev = sc.nextDouble();
        System.out.print("Additional Charges:\t$");
        double charges = sc.nextDouble();
        sc.close();

        double total = prev + charges;
        double interest = 0;
        if (prev > 0) {
            interest = 0.02 * total;
        }
        total += interest;

        double payment = 0;
        if (total < 50) {
            payment = total;
        } else if (total < 300) {
            payment = 50;
        } else if (total > 300) {
            payment = 0.2 * total;
        }

        System.out.printf("Interest:\t\t$%.2f%n%n", interest);
        System.out.printf("New Balance:\t\t$%.2f%n%n", total);
        System.out.printf("Minimum Payment:\t$%.2f", payment);
    }
}
