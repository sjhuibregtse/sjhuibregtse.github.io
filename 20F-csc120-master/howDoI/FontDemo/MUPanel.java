/*
    Sample program showing various Font settings     
*/

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(650, 675));
        setName("Examples of Different Fonts in Java");
        setUp();
        setBackground(Color.LIGHT_GRAY);

    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        //create a rectangle to serve as a frame
        g.setColor( Color.WHITE );
        g.fillRect( 15, 15, 620, 645 );
                
        g.setColor( Color.BLUE );
        g.setFont( new Font("SansSerif", Font.PLAIN, 18) );
        g.drawString("This is \"SansSerif\", 18 point size; style is Font.PLAIN", 30, 40);
                
        g.setColor( Color.GREEN.darker() );
        g.setFont( new Font("SansSerif", Font.ITALIC, 18) );
        g.drawString("style is Font.ITALIC", 290, 75);
                
        g.setColor( Color.RED );
        g.setFont( new Font("SansSerif", Font.BOLD, 18) );
        g.drawString("style is Font.BOLD", 290, 110);
                
        g.setColor( Color.MAGENTA );
        g.setFont( new Font("SansSerif", Font.BOLD+Font.ITALIC, 18) );
        g.drawString("style is Font.BOLD+Font.ITALIC", 290, 145);
                
        
        g.setColor( Color.BLUE );
        g.setFont( new Font("Serif", Font.PLAIN, 20) );
        g.drawString("This is \"Serif\", 20 point size; style is Font.PLAIN", 30, 205);
                
        g.setColor( Color.GREEN.darker() );
        g.setFont( new Font("Serif", Font.ITALIC, 20) );
        g.drawString("style is Font.ITALIC", 290, 240);
                
        g.setColor( Color.RED );
        g.setFont( new Font("Serif", Font.BOLD, 20) );
        g.drawString("style is Font.BOLD", 290, 275);
                
        g.setColor( Color.MAGENTA );
        g.setFont( new Font("Serif", Font.BOLD+Font.ITALIC, 20) );
        g.drawString("style is Font.BOLD+Font.ITALIC", 290, 310);
                
        
        g.setColor( Color.BLUE );
        g.setFont( new Font("Monospaced", Font.PLAIN, 16) );
        g.drawString("This is \"Monospaced\", 16 point size; style is Font.PLAIN", 30, 370);
                
        g.setColor( Color.GREEN.darker() );
        g.setFont( new Font("Monospaced", Font.ITALIC, 16) );
        g.drawString("style is Font.ITALIC", 290, 405);
                
        g.setColor( Color.RED );
        g.setFont( new Font("Monospaced", Font.BOLD, 16) );
        g.drawString("style is Font.BOLD", 290, 440);
                
        g.setColor( Color.MAGENTA );
        g.setFont( new Font("Monospaced", Font.BOLD+Font.ITALIC, 16) );
        g.drawString("style is Font.BOLD+Font.ITALIC", 290, 475);
                
        
        g.setColor( Color.BLACK );
        g.setFont( new Font("Serif", Font.PLAIN, 10) );
        g.drawString("10 point PLAIN Serif text", 30, 525);
        g.setFont( new Font("SansSerif", Font.PLAIN, 10) );
        g.drawString("10 point PLAIN SansSerif text", 325, 525);
                
        g.setFont( new Font("Serif", Font.PLAIN, 12) );
        g.drawString("12 point PLAIN Serif text", 30, 550);
        g.setFont( new Font("SansSerif", Font.PLAIN, 12) );
        g.drawString("12 point PLAIN SansSerif text", 325, 550);
                
        g.setFont( new Font("Serif", Font.PLAIN, 14) );
        g.drawString("14 point PLAIN Serif text", 30, 575);
        g.setFont( new Font("SansSerif", Font.PLAIN, 14) );
        g.drawString("14 point PLAIN SansSerif text", 325, 575);
                
        g.setFont( new Font("Serif", Font.PLAIN, 16) );
        g.drawString("16 point PLAIN Serif text", 30, 600);
        g.setFont( new Font("SansSerif", Font.PLAIN, 16) );
        g.drawString("16 point PLAIN SansSerif text", 325, 600);
                
        g.setFont( new Font("Serif", Font.PLAIN, 18) );
        g.drawString("18 point PLAIN Serif text", 30, 625);
        g.setFont( new Font("SansSerif", Font.PLAIN, 18) );
        g.drawString("18 point PLAIN SansSerif text", 325, 625);
                
        g.setFont( new Font("Serif", Font.PLAIN, 20) );
        g.drawString("20 point PLAIN Serif text", 30, 650);
        g.setFont( new Font("SansSerif", Font.PLAIN, 20) );
        g.drawString("20 point PLAIN SansSerif text", 325, 650);
		
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
