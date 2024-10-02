package Practice5;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Regular price: $");
        double price = sc.nextDouble();
        System.out.print("Dept code: ");
        int code = sc.nextInt();
        sc.close();

        double discount = 0;
        switch (code) {
            case 310:
                discount = 0.1;
                break;
            case 438:
                discount = 0.12;
                break;
            case 284:
                discount = 0.08;
                break;
            case 652:
                discount = 0.15;
                break;
            default:
                discount = 0.05;
        }

        System.out.printf("%nRegular price: $%.2f%n", price);
        price -= discount * price;
        System.out.printf("Sale price: %.2f", price);
    }
}