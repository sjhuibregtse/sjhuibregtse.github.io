/*
 * Tester.java
 * Test 1 Review Problem b
 *
 */

import java.awt.*;
public class Tester {
    
    private Integer over, down, width, height;
    private Color testerColor, lineColor;
    
    public Tester(Integer x, Integer y, Integer size, Color color) {
        over = x;
        down = y;
        width = size;
        height = size;
        testerColor = color;
        lineColor = Color.WHITE;
        if (testerColor.equals(Color.WHITE) ) {
            lineColor = Color.BLACK;
        }
    } // constructor
    
    public void draw(Graphics g) {
        g.setColor(testerColor);
        g.fillRect(over, down, width, height);
        g.setColor(lineColor);
        g.drawLine(over, down, over + width, down + height);
        g.drawLine(over, down + height/2, over + width, down + height/2);
        g.drawLine(over, down + height, over + width, down);
    } // end of draw()
    
} // end of class Tester
