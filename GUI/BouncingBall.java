import java.awt.*;
import javax.swing.*;

public class BouncingBall extends JPanel {
    int x = 0;
    int y = 0;
    int velX = 2; // x-velocity px/s
    int velY = 3; // y-velocity px/s

    private static int diam = 50; // diameter of ball

    public static void main(String[] args) {
        BouncingBall comp = new BouncingBall();
        JFrame frame = new JFrame("Animation");
        frame.getContentPane().add(comp);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            comp.moveBall();
            comp.repaint();

            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.drawRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.red);
        g.fillOval(x, y, diam, diam);
    }

    public void moveBall() {
        if (x > getWidth() - diam || x < 0) {
            velX *= -1;
        }
        if (y > getHeight() - diam || y < 0) {
            velY *= -1;
        }

        x += velX;
        y += velY;
    }
}
