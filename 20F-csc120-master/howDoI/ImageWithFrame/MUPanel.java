
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

   
    private ImageWithFrame car1, car2, monkey;

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("ImageWithFrame Demo");
        setUp();
        setBackground(Color.WHITE);

        car1 = new ImageWithFrame(10, 10, "vwvan.png");
        car2 = new ImageWithFrame(50, 190, "racecar.png");
        monkey = new ImageWithFrame(30, 370, "monkey.jpg");
		
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        car1.draw(g);
        car2.draw(g);
        monkey.draw(g);
		
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
