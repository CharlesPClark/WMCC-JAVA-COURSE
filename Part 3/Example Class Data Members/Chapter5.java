/**
 * @(#)Chapter5.java
 *
 *
 * @author 
 * @version 1.00 2015/12/13
 */


public class Chapter5 {
	
	public class Name {
		
		private String first;
		private String middle;
		private String last;
		
		public String displayName() {
			
			return first + " " + middle + " " + last;	
				
		}
		
		public String getInitials() {
			
			return first.substring(0,1)+ middle.substring(0,1)+ last.substring(0,1);
	
		}
		
	}
	
    public static void main(String[] args) {
    	
   		Chapter5.getInitials();
   		
    }
    
    
}