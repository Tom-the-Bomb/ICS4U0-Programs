package SampleTest1;

import java.util.*;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Time: ");
        int seconds = sc.nextInt();

        System.out.printf(
            "%d seconds is: %d h, %d m, %d s",
            seconds,
            seconds / 3600,
            (seconds = seconds % 3600) / 60,
            seconds % 60
        );
        sc.close();
    }
}