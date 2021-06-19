/* 
 * Demo of Polygon Class
 * 
 * This program draws two Sailboat objects, and the Sailboats use
 *   two Polygons to draw the shapes that make up the Sailboats
 * 
 * Look at the Sailboat.java file to see how to use Polygons
 * 
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    private Sailboat sallysBoat, chucksBoat;
    
    
    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(500, 400));
        setName("Demo for Use of Polygon Class");
        setBackground(Color.WHITE);

        sallysBoat = new Sailboat(350, 150, Color.MAGENTA);
        chucksBoat = new Sailboat(85, 355, Color.BLUE);
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!
		
        sallysBoat.draw(g);
        chucksBoat.draw(g);
		
    } // end of paintComponent()
    
    
    
       
    
    
    
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
