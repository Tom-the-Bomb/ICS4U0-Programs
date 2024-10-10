package Practice7;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Retirement Account: ");
        int balance = sc.nextInt();

        System.out.println("\nWithdrawals");

        int withdrawal = 0;
        int year = 1;

        while (withdrawal != -1 && balance >= 0) {
            System.out.printf("Year %d: ", year);
            withdrawal = sc.nextInt();

            if (withdrawal != -1) {
                balance -= withdrawal;
                year++;
            }
        }

        System.out.printf("%nYou have $%d left.", balance);
        sc.close();
    }
}
