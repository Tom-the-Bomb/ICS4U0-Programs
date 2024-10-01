package Practice4;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Salary increase statement\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Name:\t\t");
        sc.nextLine();
        System.out.print("Salary:\t\t$");
        double salary = sc.nextDouble();
        System.out.print("Performance:\t");
        String performance = sc.next();
        sc.close();

        double raise = 0;
        if (performance.equalsIgnoreCase("Excellent")) {
            raise = 0.06 * salary;
        } else if (performance.equalsIgnoreCase("Good")) {
            raise = 0.04 * salary;
        } else if (performance.equalsIgnoreCase("Poor")) {
            raise = 0.015 * salary;
        }

        System.out.printf("Raise:\t\t$%.2f%n", raise);
        System.out.printf("Raised Salary:\t$%.2f%n", salary + raise);
    }
}