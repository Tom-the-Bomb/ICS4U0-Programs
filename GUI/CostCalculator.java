
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CostCalculator extends JPanel implements ActionListener {
    JLabel itemLabel = new JLabel("Item");
    JLabel priceLabel = new JLabel("Unit Price");
    JLabel qtLabel = new JLabel("Quantity");
    JButton costBtn = new JButton("Cost");

    JTextField itemInput = new JTextField();
    JTextField priceInput = new JTextField();
    JTextField qtInput = new JTextField();
    JTextField costOutput = new JTextField();

    public CostCalculator() {
        setLayout(null);
        setBackground(Color.gray);

        int itemWidth = 100;
        int itemHeight = 50;

        int x = 50;
        int y = 50;
        int gapX = 50;
        int gapY = 50;

        costBtn.addActionListener(this);

        for (JComponent comp : new JComponent[] {
            itemLabel, priceLabel, qtLabel, costBtn
        }) {
            comp.setBounds(x, y, itemWidth, itemHeight);
            add(comp);
            y += itemHeight + gapY;
        }

        x += itemWidth + gapX;
        y = 50;

        for (JComponent comp : new JComponent[] {
            itemInput, priceInput, qtInput, costOutput
        }) {
            comp.setBounds(x, y, itemWidth, itemHeight);
            add(comp);
            y += itemHeight + gapY;
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(costBtn)) {
            try {
                int price = Integer.parseInt(priceInput.getText());
                int qt = Integer.parseInt(qtInput.getText());

                costOutput.setText(
                    String.format("$%.2f", price * qt * 1.13)
                );
            } catch (Exception err) {
                costOutput.setText("Input error");
            }
        }
    }

    public static void main(String[] args) {
        CostCalculator panel = new CostCalculator();
        JFrame frame = new JFrame("Cost Calculator");
        frame.getContentPane().add(panel);
        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
