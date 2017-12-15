/**
 * @(#)Name.java
 *
 *
 * @author 
 * @version 1.00 2015/12/13
 */


public class Name 
{
	
	private String first;
	private String middle;
	private String last;
    
    public Name(String f, String m, String l) {
    	
    	first = f;
    	middle = m;
    	last = l;
    	
    }
    
    public Name(String f, String l) {
    	
    	first = f;
    	middle = "";
    	last = l;
    	
    }
    
    public Name(String l) {
    	
    	first = "";
    	middle = "";
    	last = l;
    	
    }
    
    public Name() {
    	
    	first = "";
    	middle = "";
    	last = "";
    	
    }
    
    public String toString() {
    	
    	return first + " " + middle + " " + last;
    	
    }
    
}