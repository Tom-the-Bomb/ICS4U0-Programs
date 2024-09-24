package Practice3;

import java.util.*;

public class StringMethods {
    private static Scanner scanner = new Scanner(System.in);

    public static void q1() {
        System.out.print("Enter a word: ");
        System.out.printf("It has %d characters%n", scanner.nextLine().length());
    }

    public static void q2() {
        System.out.print("Enter the first number: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the second number: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.printf("Product: %d%n", a * b);
    }

    public static void q3() {
        System.out.print("Original string: ");
        String string = scanner.nextLine();

        System.out.print("Specified sequence of characters: ");
        String sequence = scanner.nextLine();

        System.out.println(string.contains(sequence));
    }

    public static void q4() {
        System.out.print("String 1: ");
        String s1 = scanner.nextLine();

        System.out.print("String 2: ");
        String s2 = scanner.nextLine();

        System.out.printf("Comparing %s with %s: %b%n", s1, s2, s1.equals(s2));
    }

    public static void q5() {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the first digit: ");
        int start = scanner.nextInt();

        System.out.print("Enter the second digit: ");
        int end = scanner.nextInt();

        System.out.println(sentence.substring(start, end));
    }

    public static void q6() {
        System.out.print("Enter a number: ");
        String string = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += Integer.parseInt(string.substring(i, i + 1));
        }
        System.out.printf("Sum of digits: %d", sum);
    }

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
    }
}