package Practice7;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integers (0 to quit)");

        int product = 1;
        int count = 1;
        int num = 1;

        while (num != 0) {
            System.out.printf("#%d: ", count);
            num = sc.nextInt();

            if (num < 0) {
                System.out.printf("%d not counted%n", num);
            } else if (num > 0) {
                count++;
                product *= num;
            }
        }

        System.out.printf("%nThe product of the %d positives is %d.", count - 1, product);
        sc.close();
    }
}