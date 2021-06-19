/* CSC xxx Project/Lab # x
 * Samantha Student
 * Today's Date
 *
 * Project Description:
 *
 * Acknowledgements:
 * 
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private data & objects here:
    

    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Mount Union Java Program");
        setBackground(Color.WHITE);

        // 2. Instantiate objects here:
        

    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call the draw method of your objects here:
        

        g.drawString("Hello, world", 100, 100);

    } // end of method paintComponent
    
    // Add other methods here:
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel().frame();}

} // end of class MUPanel
