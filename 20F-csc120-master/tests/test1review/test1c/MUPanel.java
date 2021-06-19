/* CSC 120 Review for Test # 1, part c
 * 
 * Drawing Specific Shapes using methods of
 * the Graphics class
 *
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
    
    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(700, 500));
        setName("Shape Drawing with the Graphics class");
        setUp();
        setBackground(Color.BLACK);

        // 2. Instantiate objects here by calling "new":
        

        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call methods of objects here:

        
		
		
    } // end of paintComponent()
    
    
    
       
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
