package Practice5;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        System.out.printf(
            "The largest number is: %d",
            a > b && a > c ? a : b > c ? b : c
        );
    }
}