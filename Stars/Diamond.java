package Stars;

public class Diamond {
    public static void main(String[] args) {
        int size = 10;

        for (int i = size % 2; i <= size; i += 2) {
            for (int j = 1; j <= size/2 - i/2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size - 2; i >= size % 2; i -= 2) {
            for (int j = 1; j <= size/2 - i/2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}