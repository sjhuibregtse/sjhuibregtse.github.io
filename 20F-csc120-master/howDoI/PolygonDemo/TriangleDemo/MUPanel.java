/* 
 * Example of use of Polygon objects to draw two simple triangles
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    /////////////////////////////////
    // 1. Declare the Polygon objects
    /////////////////////////////////
    
    private Polygon triang1, triang2;
    
    
    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(400, 300));
        setName("Triangle Demo -- Using the Polygon Class");
        setBackground(Color.WHITE);

        
        /////////////////////////////////////
        // 2. Instantiate the Polygon objects
        /////////////////////////////////////
        
        triang1 = new Polygon();
        triang2 = new Polygon();
        
        
        ////////////////////////////////////////
        // 2.5 Add points to the Polygon Objects
        ////////////////////////////////////////
        
        triang1.addPoint(150, 50);
        triang1.addPoint(50, 150);
        triang1.addPoint(250, 150);
        
        triang2.addPoint(20, 240);
        triang2.addPoint(300, 190);
        triang2.addPoint(300, 290);
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!
		
        //////////////////////////////
        // 3. Draw the Polygon Objects
        //////////////////////////////
	
        g.setColor(Color.RED);
        g.fillPolygon(triang1);
        
        g.setColor(Color.BLUE);
        g.drawPolygon(triang2);
		
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
