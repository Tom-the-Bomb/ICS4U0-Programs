package Practice4;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Guides for Lake Lazy Days Activities\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the temperature: ");
        double temp = sc.nextDouble();
        sc.close();

        String activity = "";
        if (temp > 95 || temp < 20) {
            activity = "Visit our shops";
        } else if (temp < 40) {
            activity = "Skiing";
        } else if (temp < 60) {
            activity = "Golf";
        } else if (temp < 80) {
            activity = "Tennis";
        } else if (temp <= 95) {
            activity = "Swimming";
        }

        System.out.printf("%s is the best option", activity);
    }
}
