/*
    A graphical class that displays as a flag.

    The flag is a rectangle of one color with a
    horizontal stripe of another color.
	
	The width and height of the flag are fixed as constants
	
    Author Louise Moses. Modified by John Kirchmeyer and Blase Cindric
    Version 2.0 August 20, 2018
*/


import java.awt.*;


public class Flag {

    // private variables:
	
    private Color flagColor;      // The background color of this flag object.
    private Color stripeColor;    // The color of the horizontal stripe.
    private Integer over;         // The horizontal position of the upper left corner of this Flag object.
    private Integer down;         // The vertical position of the upper left corner of this Flag object.

    // private constants:
	
    private final Integer WIDTH  = 200;    // The overall width of this Flag object.
    private final Integer HEIGHT = 120;    // The overall height of this Flag object.



    // constructor method:
	
    public Flag(Integer ov, Integer dn, Color flagCol, Color stripeCol) {
        over = ov;
        down = dn;
        flagColor = flagCol;
        stripeColor = stripeCol;
    } // end of constructor

    
	
    // other methods:
	
    public void draw(Graphics g) {
        g.setColor(flagColor);
        g.fillRect(over, down, WIDTH, HEIGHT);

        //horizontal bar in the middle
        g.setColor(stripeColor);
        g.fillRect(over, down + (HEIGHT/3), WIDTH, (HEIGHT/3));

        //outline the flag in black
        g.setColor(Color.BLACK);
        g.drawRect(over, down, WIDTH, HEIGHT);
    } // end of draw


	
    public String toString() {
        String tempString;

        tempString = "Flag with over=" + over
                    + " down=" + down
                    + " flagColor=" + flagColor.toString()
                    + " stripeColor=" + stripeColor.toString();
        return tempString;
    } // end of toString

	
	
} // end of class Flag
