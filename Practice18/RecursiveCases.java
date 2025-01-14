package Practice18;

public class RecursiveCases {
    public static int search(String[] arr, int index, String item) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index].equals(item)) {
            return index;
        }
        return search(arr, index + 1, item);
    }

    public static boolean palindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static String reverse(String s) {
        if (s.length() == 0) {
            return "";
        }
        // move last char to front
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static int findNumOfChar(String s, char x) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.charAt(0) == x) {
            return findNumOfChar(s.substring(1), x) + 1;
        } else {
            return findNumOfChar(s.substring(1), x);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int permutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static int productRange(int low, int high) {
        if (low < high) {
            return low * productRange(low + 1, high);
        }
        return high;
    }

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        String[] arr = { "apple", "banana", "cherry", "date", "elderberry" };
        System.out.println(search(arr, 0, "date"));
        System.out.println(search(arr, 0, "grape"));

        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("hello"));

        System.out.println(reverse("hello"));

        System.out.println(findNumOfChar("hello", 'l'));

        System.out.println(factorial(5));
        System.out.println(permutation(5, 2));
        System.out.println(productRange(1, 5));
        System.out.println(power(2, 3));
    }
}