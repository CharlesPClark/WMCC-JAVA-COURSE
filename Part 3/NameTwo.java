/**
 * @(#)Name.java
 *
 *
 * @author 
 * @version 1.00 2015/12/13
 */


public class NameTwo
{
	
	private String first;
	private String middle;
	private String last;
    
    public NameTwo(String f, String m, String l) {
    	
    	first = f;
    	middle = m;
    	last = l;
    	
    }
    
    public NameTwo(String f, String l) {
    	
    	first = f;
    	middle = "";
    	last = l;
    	
    }
    
    public NameTwo(String l) {
    	
    	first = "";
    	middle = "";
    	last = l;
    	
    }
    
    public NameTwo() {
    	
    	first = "";
    	middle = "";
    	last = "";
    	
    }
    
    public String toString() {
    	
    	return first + " " + middle + " " + last;
    	
    }
    
    public String getFirst() {
    	
    	return first;
    }
    
    public String getMiddle() {
    	
    	return middle;
    	
    }
    
    public String getLast() {
    	
    	return last;
    	
    }
    
    public void setFirst(String fname) {
    	
    	first = fname;
    }
   	
   	public void setMiddle(String mname) {
   		
   		middle = mname;
   			
   	}
   	
   	public void setLast(String lname) {
   		
   		last = lname;
   		
   	}
   	
   	public void setName(String f, String m, String l) {
   		
   		first = f;
   		middle = m;
   		last = l;
   		
   	}
}