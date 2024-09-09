package Practice1;

import javax.swing.*;

public class Q1 extends JFrame {
    public static void main(String[] args) {
        String rawPrice = JOptionPane.showInputDialog("Enter the unit price");
        String rawAmount = JOptionPane.showInputDialog("Enter quantity");

        double price = Double.parseDouble(rawPrice);
        double amount = Double.parseDouble(rawAmount);
        double total = price * amount * 1.13;

        JOptionPane.showMessageDialog(null, String.format("Final Price: $%.2f", total));
    }
}
