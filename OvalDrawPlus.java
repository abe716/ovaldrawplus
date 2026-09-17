import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class OvalDrawPlus extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);

        g.fillOval(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {

        System.out.println("Starting OvalDrawPlus...");

        JFrame window = new JFrame("Oval Draw Plus");

        window.setSize(400, 500);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(new OvalDrawPlus());

        window.setVisible(true);
    }
}