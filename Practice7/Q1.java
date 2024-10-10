package Practice7;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int multiple = num;
        while (multiple < 100) {
            if (multiple == num) {
                System.out.printf("%nMultiples of %d are %d", multiple, multiple);
            } else {
                System.out.printf(", %d", multiple);
            }
            multiple += 15;
        }
        sc.close();
    }
}