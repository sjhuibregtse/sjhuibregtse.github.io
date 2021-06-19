/**
    Book class
    Author:   Blase Cindric
    Modified: 01/05/2005 John Kirchmeyer
        Changed getPages, setPages to
        getNumPages, setNumPages.
*/
public class Book
{ // Book

    private String title;
    private String author;
    private int numPages;

    public Book(String title, String author, int numPages)
    { // constructor
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    } // constructor

    public int getNumPages()
    { // getNumPages
        return numPages;
    } // getNumPages

    public void setNumPages(int numPages)
    { // setNumPages
        this.numPages = numPages;
    } // setNumPages

    public String toString()
    { // toString

        String result;
        result = title;
        result = result + ", by " + author;
        result = result + " has " + numPages + " pages.";
        return result;

    } // toString

} // Book
