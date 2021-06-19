/**
 *
 * File:  ThingOne.java
 * 
 * Author: 
 * 
 * Description:
 * 
 */

import java.awt.*;

public class ThingOne {

    private Integer anchorX;
    private Integer anchorY;
    private Integer width;
    private Integer height;
    private String  name;
    private Color   thingColor;
    
    
    public ThingOne(Integer x, Integer y, Integer w, Integer h, String n, Color c) {
        anchorX = x;
        anchorY = y;
        width = w;
        height = h;
        name = n;
        thingColor = c;
    } // end of constructor
    
    
    public void draw( Graphics g ) {
        
    } // end of draw()
    
    
    public String toString() {
        return "My name is " + name + " and I am a ThingOne that is "
                + width + " wide and " + height + " high";
    } // end of toString()
    
    
} // end of class ThingOne
