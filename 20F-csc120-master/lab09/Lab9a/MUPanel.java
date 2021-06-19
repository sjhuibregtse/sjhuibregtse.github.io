/*
    CSC 120 Lab 9a
    
    A simple example that uses an array of Student objects.

    Originally authored by UMU CSIS faculty.
    
*/


import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel
{
    private Student[] studentRoster;

    private JTextArea answerArea;
    
    
    //constructor method
    public MUPanel() {
	
        setName("CSC 120 Lab 9a by Samantha Student");
        setUpGUI();
        
        fillArray();

        displayEntireArray();

        
    } // end of constructor


    private void fillArray() {
        /************************************
         * INSTANTIATE AN ARRAY OF STUDENTS *
         ************************************/
        studentRoster = new Student[15];

        /*****************************************************
         * INSTANTIATE EACH ELEMENT OF THE ARRAY OF STUDENTS *
         *****************************************************/
        studentRoster[0]  = new Student("Samantha Student", "Residence", 4, false, 3.6);
        studentRoster[1]  = new Student("Maria Livers", "East Hall", 1, true, 2.5);
        studentRoster[2]  = new Student("Joseph Schmoe", "off-campus", 3, true, 1.99);
        studentRoster[3]  = new Student("Ivan Bowski", "Shields Hall", 2, false, 3.7);
        studentRoster[4]  = new Student("Helga Schwartz", "East Hall", 1, true, 1.2);
        studentRoster[5]  = new Student("Fritz Puma", "Miller Hall", 4, false, 2.97);
        studentRoster[6]  = new Student("Anton Anderson", "Shields Hall", 1, false, 3.49);
        studentRoster[7]  = new Student("Maura Norton", "McMaster Hall", 3, false, 3.14);
        studentRoster[8]  = new Student("Ralph Droms", "Shields Hall", 2, true, 2.01);
        studentRoster[9]  = new Student("Ellen Matchett", "off-campus", 1, false, 4.0);
        studentRoster[10] = new Student("Pearl Sovwisdom", "McMaster Hall", 2, false, 2.64);
        studentRoster[11] = new Student("Patrick Star", "Miller Hall", 1, true, 3.89);
        studentRoster[12] = new Student("Cindy Vortex", "East Hall", 1, false, 3.2);
        studentRoster[13] = new Student("Karl Leubner", "Sheilds Hall", 2, false, 3.02);
        studentRoster[14] = new Student("Norma Slugger", "McMaster Hall", 2, true, 2.97);

    } // end of fillArray()

    private void displayEntireArray() {
        /************************************************************
         * DISPLAY CONTENTS OF ENTIRE ARRAY IN THE TEXTAREA          *
         * CALCULATE AND PRINT THE AVERAGE AND THE NUMBER OF OBJECTS *
         ************************************************************/

        Integer count;
        Double totalGPA, avgGPA;

        answerArea.append("Listing of ALL students:\n");
        answerArea.append("\n"); // blank line

        count = 0;
        totalGPA = 0.0;

        for (Integer k = 0; k < studentRoster.length; k++) {

            answerArea.append("      " + studentRoster[k].toString() + "\n");
            count++;
            totalGPA += studentRoster[k].getGpa();
			
        } // end for loop

        avgGPA = totalGPA / count;

        answerArea.append("\n");
        answerArea.append("There are " + count + " students listed.\n");
        answerArea.append("Average gpa = " + avgGPA + "\n");
        answerArea.append("==================================\n\n");

    } // end of displayEntireArray()

    
    
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUpGUI() {
        
        //  setLayout(null); is NOT used here so that a simple layout manager
        //  called FlowLayout will automatically calculate the size of the 
        //  MUPanel from the sizes of the things that are added to it.

        //  Set up a scrollable text area for the student information
        //  to be displayed in.
        answerArea = new JTextArea(25, 55);
        JScrollPane s = new JScrollPane(answerArea);
        s.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        s.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(s);
    } // end of setUpGUI()
    
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