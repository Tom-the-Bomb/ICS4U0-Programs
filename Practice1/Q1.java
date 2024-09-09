package Practice1;

import java.util.*;
import javax.swing.*;

public class Q1 extends JFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price ($): ");
        double price = sc.nextDouble();
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        double total = price * amount * 1.13;
        JOptionPane.showMessageDialog(null, String.format("Final Price: $%.2f", total));
        sc.close();
    }
}
