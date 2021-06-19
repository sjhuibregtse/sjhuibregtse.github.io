/* CSC 120 Lab 3
 * Samantha Student
 * Today's Date
 *
 * Project Description:
 *
 *    Display boats.
 *
 * Acknowledgements:
 * 
 *    Original source code for this class is from Mount Union CS faculty.
 *
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private data & objects here:
    
    private Boat boat1;
	
	
	

    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 450));
        setName("Mount Union Java Program");
        setBackground( new Color(153, 217, 234) );      //  Make the background look like water.

        // 2. Instantiate Boats.
        
        boat1 = new Boat("My Yacht", 50, 200);

		
		
        // Display Boats in the Java Console
        
        System.out.println(boat1.toString());

		
		
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Draw Boats.
        
        boat1.draw(g);

		
		
    } // end of paintComponent
    
	
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
