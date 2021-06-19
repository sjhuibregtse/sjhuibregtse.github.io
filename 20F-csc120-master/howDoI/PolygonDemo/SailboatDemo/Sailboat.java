/*
 * Sailboat.java
 *
 * John Kirchmeyer
 * September 8, 2006
 *
 * Demonstrates how to use Polygons.
 *
 * Step 1:   Declare a Polygon
 * Step 2:   Instantiate a Polygon
 * Step 2.5: Add points to the Polygon
 * Step 3:   Draw the Polygon
 */
import java.awt.*;
public class Sailboat {

    private Integer anchorX, anchorY;
    private final Integer WIDTH = 120;
    private final Integer HEIGHT = 20;
    private final Integer BOW_WIDTH = 30;
    private final Integer MAST_HEIGHT = 65;
    
    private Color boatColor;
    
    ///////////////////////////////
    // Step 1: Declare the Polygons
    ///////////////////////////////
    private Polygon bodyForBoat;
    private Polygon sailForBoat;
    
    public Sailboat(int x, int y, Color c) {
        anchorX = x;
        anchorY = y;        
        boatColor = c;

        ///////////////////////////////////
        // Step 2: Instantiate the Polygons
        ///////////////////////////////////
        bodyForBoat = new Polygon();
        sailForBoat = new Polygon();
        
        ///////////////////////////////////////
        // Step 2.5: Add points to the Polygons
        ///////////////////////////////////////

        bodyForBoat.addPoint(anchorX, anchorY);
        bodyForBoat.addPoint(anchorX+WIDTH, anchorY);
        bodyForBoat.addPoint(anchorX+WIDTH, anchorY+HEIGHT);
        bodyForBoat.addPoint(anchorX+BOW_WIDTH, anchorY+HEIGHT);
        
        sailForBoat.addPoint(anchorX+WIDTH/2, anchorY-MAST_HEIGHT); 
        sailForBoat.addPoint(anchorX+WIDTH, anchorY-MAST_HEIGHT/2); 
        sailForBoat.addPoint(anchorX+WIDTH/2, anchorY); 
        
    } // end of constructor
    
    public void draw(Graphics g) {

        g.setColor(boatColor);

        ///////////////////////////////////////////////////////
        // Step 3: draw the Polygons.
        // Actually, you have to pass the Polygon
        // as a parameter to the fillPolygon method
        // of a Graphics object and ask it to draw the Polygon
        ///////////////////////////////////////////////////////
        
        // draw the body
        g.fillPolygon(bodyForBoat);
        
        // draw the mast
        g.fillRect(anchorX+WIDTH/2, anchorY-MAST_HEIGHT, 5, MAST_HEIGHT);
        
        // draw the sail
        g.fillPolygon(sailForBoat);
    } // end of draw
    
} // end of class Sailboat
