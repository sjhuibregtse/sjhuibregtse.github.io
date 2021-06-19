/*
 * File: ImageWithFrame.java
 *
 * Example of Using a BufferedImage object to display a
 * JPG, GIF or PNG file inside a DARK_GRAY frame that is
 * 10 pixels wide
 *
 * The file should be stored in the NetBeans project folder,
 * not in the src folder of the project.
 */

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageWithFrame {
    
    Integer over, down, width, height;
    BufferedImage pic;
    
    public ImageWithFrame (Integer x, Integer y, String url) {
        over = x;
        down = y;
        try {
            pic = ImageIO.read(new File( url ) );
        } // end try
        catch (IOException e) {
            System.out.println(e);
        } // end catch
        width = pic.getWidth() + 20;   // 10 pixels each side
        height = pic.getHeight() + 20; // 10 pixels top & bottom
    } // end of constructor
    
    public void draw(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(over, down, width, height);
        g.drawImage(pic, over+10, down+10, null);
    } // end of draw
    
} // end of class ImageWithFrame
