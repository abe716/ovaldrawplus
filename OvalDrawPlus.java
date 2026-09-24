import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OvalDrawPlus extends JPanel {

    
    static final Color RECTANGLE_COLOR = new Color(0, 0, 139);

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draws background rectangle
        g.setColor(RECTANGLE_COLOR);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw the green oval
        g.setColor(Color.GREEN);
        g.fillOval(0, 0, getWidth(), getHeight());
    }

    public static void main(String[] args) {

        System.out.println("Starting OvalDrawPlus...");

        JFrame window = new JFrame("Oval Draw Plus");

        window.setSize(400, 500);

        window.setLocation(250, 150);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing OvalDrawPlus...");
            }
        });

        window.add(new OvalDrawPlus());

        window.setVisible(true);
    }
}