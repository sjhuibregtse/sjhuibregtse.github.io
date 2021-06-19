import java.awt.*;
/**
    A graphical class that displays as a balloon with an attached string.
    @author John Kirchmeyer
    @version 1.0 December 6, 2004
*/
public class BalloonOnAString extends Balloon
{ // BalloonOnAString

    /**
     * The length of the string extending down from the bottom middle of the balloon.
     */
    private int stringLength;

    /**
     * Create and Initialize a new Balloon.
     * @param stringLength The length of the attached string.
     */
    public BalloonOnAString(int over, int down, int size, Color color, int strLength)
    { // constructor
        super(over, down, size, color);
        stringLength = strLength;
    } // constructor

    /**
     * Draws this Balloon object on the Graphics context g.
     * @param g A Graphics context on which to draw.
    */
    public void draw(Graphics g)
    { // draw
        g.setColor(color);
        g.fillOval(over, down, size, size);
        g.setColor(color.BLACK);
        g.drawLine(over+size/2, down+size, over+size/2, down+size+stringLength);
    } // draw

    /**
     * Returns a string representation of the values of this Balloon object's over, down, size, color, and stringLength fields. 
     * @return a string representation of this Balloon object.
     */
    public String toString()
    { // toString
        String result;
        result = super.toString();
        result += ", stringLength=" + stringLength;
        return result;
    } // toString

} // BalloonOnAString
