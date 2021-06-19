

import java.awt.*;

public class Star {
    
    private Integer over, down;
    
    public Star(Integer ov, Integer dn) {
        over = ov;
        down = dn;
    } // end of constructor

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.drawLine(over+1, down+1, over+9, down+9);
        g.drawLine(over+9, down+1, over+1, down+9);
        g.drawLine(over+5, down, over+5, down+10);
        g.drawLine(over+10, down+5, over, down+5);
        g.fillOval(over+2, down+2, 6, 6);
    } // end of draw()

} // end of class Star
