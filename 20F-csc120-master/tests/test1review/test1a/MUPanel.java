/*
    CSC 120 Test 1 Review Problem 1a
    Samantha Student
    Today's Date

    Description:
    Practice System.out.println and arithmetic operators.

    Using paper and pencil, write down what you think the Java Console output
    will be. Then, run the program to see if your answers were correct.
*/

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {
    public MUPanel() {
	
        setLayout(null);
        setPreferredSize(new Dimension(400, 100));
        setName("CSC 120 Test 1 Review Problem a");
        setBackground(Color.WHITE);
        
        System.out.println("1. " + (47 / 9) );

        System.out.println("2. " + (47 / 5) );

        System.out.println("3. " + ( 47 % 9 ) );

        System.out.println("4. " + ( 47 % 5 ) );

        System.out.println("5. " + ( 3 + 19 / 8 ) );

        System.out.println("6. " + ( 3 / 19 + 8 ) );

        System.out.println("7. " + ( 3 % 19 + 8 ) );

        System.out.println("8. " + ( (3 + 19) / 8 ) );

        System.out.println("9. " + ( 16 % 4 ) );

        System.out.println("10. " + ( 7654321 / 100 ) );

        System.out.println("11. " + ( 7654321 % 100 ) );

        System.out.println("12. " + ( 2 + 20 * 3 ) );

        System.out.println("13. " + ( 3 + 20 * 2 ) );

        System.out.println("14. " + ( (2 + 20) * 3 ) );

        Integer x = 209;
        Integer y = 321;

        System.out.println("15. " + ( 2*x + y/10 ) );

        System.out.println("16. " + ( 16 + 20 ) );

        System.out.println("17. " + "16" + "20" );
		
    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        g.setFont( new Font("Serif", Font.BOLD, 18) );
        g.drawString("Look in the Java Console for Output", 50, 50);
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
