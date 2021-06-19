/*
    CSC 120 Lab 9b
    
    Declare, instantiate and use an array of Book objects.
    Originally authored by UMU CS faculty.
    
*/


import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    private Book[] libraryBook;

    private JTextArea answerArea;

    
    // constructor method
    public MUPanel() {
        
        setName("CSC 120 Lab 9b by Samantha Student");
        setUpGUI();

        
        fillArray();

        
        displayEntireArray();

    } // end of constructor

    
    private void fillArray() {
        /***************************************
        * INSTANTIATE AN ARRAY OF BOOK OBJECTS *
        ****************************************/

        libraryBook = new Book[ 7 ];


        /*************************************************
        * INSTANTIATE EACH ELEMENT OF THE ARRAY OF BOOKS *
        **************************************************/

        libraryBook[0] = new Book("War and Peace", "Leo Tolstoy", 1116);
        libraryBook[1] = new Book("Gone With The Wind", "Margaret Mitchell", 1037);
        libraryBook[2] = new Book("Using Java", "Julien Hennefeld", 468);
        libraryBook[3] = new Book("Autobiography of a Yogi", "Paramahansa Yogananda", 367);
        libraryBook[4] = new Book("Computing Unbound", "David Patterson", 586);
        libraryBook[5] = new Book("Heaven Help Us", "Leonard Kravitz", 612);
        libraryBook[6] = new Book("Computer Systems", "Stanley Warford", 517);

    } // end of fillArray()

    
    private void displayEntireArray () {
        Integer numLongBooks, numHardback, numPaperback, numOld;

        /***************************************************
        * DISPLAY CONTENTS OF ENTIRE ARRAY IN THE TEXTAREA *
        ****************************************************/

        answerArea.append("Listing of ALL books in the library:\n");
        answerArea.append("\n"); // blank line

        numLongBooks = 0;
        numHardback = 0;
        numPaperback = 0;
        numOld = 0;

        for (Integer k = 0; k < libraryBook.length; k++) {

            answerArea.append("      " + libraryBook[k].toString() + "\n");
			
            if (libraryBook[k].getNumPages() > 500) {
                numLongBooks++;
            } // end if

        } // end for

        answerArea.append("\n");
        answerArea.append("The number of books with more than 500 pages is " + numLongBooks + "\n");
        //answerArea.append("The number of hardback books is " + numHardback + "\n");
        //answerArea.append("The number of paperback books is " + numPaperback + "\n");
        //answerArea.append("The number of books from before 1990 is " + numOld + "\n");
        answerArea.append("==================================\n");

    } // end of displayArray()

    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUpGUI() {
        setPreferredSize(new Dimension(600, 400));
        setLayout(null);
        
        answerArea = new JTextArea(23, 52);
        JScrollPane s = new JScrollPane(answerArea);
        s.setBounds(5, 5, 590, 390);
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
