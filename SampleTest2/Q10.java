package SampleTest2;

import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        System.out.println("Do Not Miss This Great Sale Event!!!");
        Scanner sc = new Scanner(System.in);

        int itemN = 0;
        double total = 0;

        while (true) {
            itemN += 1;

            System.out.printf("Item %d Unit Price:\t$", itemN);
            double price = sc.nextDouble();

            if (price == -1) break;

            System.out.print("Quantity:\t\t");
            price *= sc.nextInt();
            System.out.printf("Item %d is on sale:\t", itemN);

            if (sc.nextBoolean()) {
                System.out.print("Discount:\t\t%");
                price *= 1 - sc.nextInt() / 100.0;
            }
            total += price;
            System.out.println();
        }
        sc.close();
        System.out.printf("%nTotal Price:\t\t$%.2f", total);
    }
}
