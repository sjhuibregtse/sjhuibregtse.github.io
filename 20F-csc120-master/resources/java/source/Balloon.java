import java.awt.*;
/**
    A graphical class that displays as a balloon.
    Author John Kirchmeyer
    Version 1.0 June 7, 2004
*/
public class Balloon {

    // The horizontal position of the upper left corner of this Balloon object.
    private Integer over;

    // The vertical position of the upper left corner of this Balloon object.
    private Integer down;

    // The width and height for the body of this Balloon object.
    private Integer size;

    // The Color for the body of this Balloon object.
    private Color color;

/**
 * Create and Initialize a new Balloon.
 *   x     The horizontal position of the upper left corner of this Balloon object.
 *   y     The vertical position of the upper left corner of this Balloon object.
 *   sz    The width and height for the body of this Balloon object.
 *   col   The Color for the body of this Balloon object.
 */
    public Balloon(Integer x, Integer y, Integer sz, Color col) {
        over = x;
        down = y;
        color = col;
        size = sz;
    } // end of constructor

    /**
     * Draws this Balloon object on the Graphics context g.
     *   g    A Graphics context on which to draw.
    */
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(over, down, size, size);
        g.setColor(Color.BLACK);
        g.drawLine(over+size/2, down+size, over+size/2, down+size+size);
    } // end of draw()

    /**
     * Returns a string representation of the values of this Balloon object's over, down, size, and color fields. 
     */
    public String toString() {
        return "Balloon with over=" + over + ", down=" + down + ", size=" + size + ", color=" + color;
    } // end of toString

} // end of class Balloon
