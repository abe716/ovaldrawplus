import javax.swing.JFrame;

public class OvalDrawPlus {
    public static void main(String[] args) {

        System.out.println("Starting OvalDrawPlus...");

        JFrame window = new JFrame("Oval Draw Plus");

        window.setSize(400, 500);

        window.setLocation(0, 0);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       

        window.add(new OvalDrawPlusPanel());

        window.setVisible(true);
        System.out.println("Closing OvalDrawPlus...");
    }

}



    
