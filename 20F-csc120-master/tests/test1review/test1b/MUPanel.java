/*
    CSC 120 Test 1 Review Problem b
    Samantha Student
    Today's Date

    You are to declare, instantiate, and draw three Tester objects, so that they
    appear in a straight horizontal line, evenly spaced across the output window.

*/

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {
    

    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CSC 120 Test 1 Review Problem b");
        setBackground(Color.WHITE);
        
        // Instantiate objects and initialize data here

        // Hint:  look at the constructor method of the Tester class to see
		//        how many values to put in parentheses when instantiating your objects
        
        
        
        
        
        
    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        
        
        
        
        
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
