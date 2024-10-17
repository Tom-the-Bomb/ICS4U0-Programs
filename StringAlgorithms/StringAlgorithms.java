package StringAlgorithms;

public class StringAlgorithms {
    public static void reverse(String string) {
        String rev = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            rev += string.substring(i, i + 1);
        }
        System.out.println(rev);
    }

    public static void replace(String string, char c1, char c2) {
        String replaced = "";

        for (int i = 0; i < string.length(); i++) {
            char curr = string.charAt(i);
            replaced += curr == c1 ? c2 : curr;
        }
        System.out.println(replaced);
    }

    public static int countChars(String string, char c) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                count += 1;
            }
        }
        return count;
    }
}