import javax.swing.JFrame;
import javax.swing.JLabel;

public class OvalDrawPlus {

    public static void main(String[] args) {

        System.out.println("Starting OvalDrawPlus...");

        JFrame window = new JFrame("Oval Draw Plus");

        window.setSize(400, 500);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Oval Draw Plus", JLabel.CENTER);

        window.add(text);

        window.setVisible(true);
    }
}