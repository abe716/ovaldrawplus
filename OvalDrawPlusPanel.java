import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
public class OvalDrawPlusPanel extends JPanel {

    
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
}