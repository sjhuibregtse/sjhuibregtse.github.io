/*
 * CSC 120, Lab 4
 * ClothingItem.java
 * 
 * Sample Class Definition to illustrate "getter", "setter" and toString methods
 */

public class ClothingItem {
    
    private String name, type;
    private Double price;
    private Integer quantity;
    
    
    public ClothingItem( String n, String t, Double p, Integer q ) {
        name = n;
        type = t;
        price = p;
        quantity = q;
    } // end of constructor
    
    
    public String toString() {
        String answer;
        answer =  name + ", a " + type + ", purchased " + quantity
                + " at a price of $" + price;
        return answer;
    } // end of toString
    
    
    public String getName() {
        return name;
    } // end of getName
    
    public String getType() {
        return type;
    } // end of getType
    
    public Double getPrice() {
        return price;
    } // end of getPrice
    
    public Integer getQuantity() {
        return quantity;
    } // end of getQuantity
    
    
    public void setName( String n ) {
        name = n;
    } // end of setName
    
    public void setType( String t ) {
        type = t;
    } // end of setType
    
    public void setPrice( Double p ) {
        price = p;
    } // end of setPrice
    
    public void setQuantity( Integer q ) {
        quantity = q;
    } // end of setQuantity
    
	
    public Double calculateTotalSpent() {
        return quantity*price;
    } // end of calculateTotalSpent()
	
} // end of class ClothingItem
