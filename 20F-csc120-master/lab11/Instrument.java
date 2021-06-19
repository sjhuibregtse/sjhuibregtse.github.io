/*
    CSC 120
    Lab 11
    
    Instrument class
*/

public class Instrument {

    private String name, section;
    private Integer    number;
    
    public Instrument(String n, String s, Integer num) {
        name = n;
        section = s;
        if (num > 1) {
            number = num;
        }
        else {
            number = 1;
        }
    } // end of constructor
    
    public String getName() {
        return name;
    }  // end of getName()
    
    public String getSection() {
        return section;
    }  // end of getSection()
    
    public Integer getNumber() {
        return number;
    }  // end of getNumber()
    
    public void setName(String n) {
        name = n;
    } // end of setName()
    
    public void setSection(String s) {
        section = s;
    } // end of setSection()
    
    public void setNumber(Integer num) {
        if (num > 1) {
            number = num;
        }
    } // end of setNumber()
    
    public String toString() {
        String answer;
        
        answer = "Instrument name: " + name + " has " + number;
        if (number != 1) {
            answer += " seats";
        }
        else {
            answer += " seat";
        }
        answer += " in the " + section + " section";
               
        return answer;
    } // end of toString()
    
} // end of class Instrument
