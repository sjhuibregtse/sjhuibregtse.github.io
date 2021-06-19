/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cindricbb
 */

import java.awt.*;

public class MUTextArea extends TextArea {
    
    public MUTextArea() {
        super();
        super.setFont(new Font("Monospaced", Font.PLAIN, 12));
        super.setEditable(false);
    } // end of constructor

    public void setBounds(Integer over, Integer down, Integer width, Integer height) {
        super.setBounds(over, down, width, height);
    } // end of setBounds
    
    public void println(String s) {
        print(s);
        append("\n");
    } // end of println
    
    public void println() {
        println("");
    }
    
    public void print(String s) {
        append(s);
    } // end of print
    
    public void print() {
        print("");
    }
    
    public void println(Integer i) {
        println(i.toString());
    } // end of println(Integer)
    
    public void println(Byte b) {
        println(b.toString());
    } // end of println(Byte)
    
    public void println(Short s) {
        println(s.toString());
    } // end of println(Short)
    
    public void println(Long lon) {
        println(lon.toString());
    } // end of println(Long)
    
    public void println(Double d) {
        println(d.toString());
    } // end of println(Double)
    
    public void println(Float f) {
        println(f.toString());
    } // end of println(Float)
    
    public void println(Boolean b) {
        println(b.toString());
    } // end of println(Boolean)
    
    public void println(Character c) {
        println(c.toString());
    } // end of println(Character)
    
    public void print(Integer i) {
        print(i.toString());
    } // end of print(Integer)
    
    public void print(Byte b) {
        print(b.toString());
    } // end of print(Byte)
    
    public void print(Short s) {
        print(s.toString());
    } // end of print(Short)
    
    public void print(Long lon) {
        print(lon.toString());
    } // end of print(Long)
    
    public void print(Double d) {
        print(d.toString());
    } // end of print(Double)
    
    public void print(Float f) {
        print(f.toString());
    } // end of print(Float)
    
    public void print(Boolean b) {
        print(b.toString());
    } // end of print(Boolean)
    
    public void print(Character c) {
        print(c.toString());
    } // end of print(Character)
    
} // end of class MUTextArea
