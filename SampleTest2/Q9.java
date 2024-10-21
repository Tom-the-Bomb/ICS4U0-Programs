package SampleTest2;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Random numbers between 1 and 100");
        int max = 0;

        for (int i = 0; i < 5; i++) {
            int num = (int) (Math.random() * 100 + 1);
            System.out.printf("%d\t", num);

            max = Math.max(max, num);
        }
        System.out.printf("%nLargest = %d", max);
    }
}