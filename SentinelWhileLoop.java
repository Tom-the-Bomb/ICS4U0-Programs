import java.util.Scanner;

public class SentinelWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int mark = 0;
        double sum = 0;

        while (mark != -1) {
            System.out.printf("Mark #%d: ", count + 1);
            mark = sc.nextInt();

            if (mark != -1) {
                sum += mark;
                count++;
            }
        }
        sc.close();

        System.out.printf("%nAverage: %.2f%%", sum / count);
    }
}