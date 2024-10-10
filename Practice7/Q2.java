package Practice7;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Distance to destination: ");
        double total = sc.nextDouble();
        System.out.println();

        double travelled = 0;
        int step = 1;

        while (travelled < total) {
            System.out.printf("Step %d distance: ", step);
            double distance = sc.nextDouble();

            travelled += distance;
            step++;
            System.out.printf("\tTotal is %.1f km%n", travelled);
        }

        System.out.println("\nYou have reached your destination.");
        sc.close();
    }
}
