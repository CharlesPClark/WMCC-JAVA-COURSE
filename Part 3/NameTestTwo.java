/**
 * @(#)NameTest.java
 *
 *
 * @author 
 * @version 1.00 2015/12/13
 */


public class NameTestTwo {

    public static void main(String[] args){
    	
    	//instantiation
    	NameTwo myName = new NameTwo("Michael", "Mason", "McMillan");
    	NameTwo yourName = new NameTwo("Charles", "Clark");
    	NameTwo aName = new NameTwo("Durr");
    	NameTwo someName = new NameTwo();
    	
    	System.out.println("myName: " + myName.toString());
    	System.out.println("myName first name: " + myName.getFirst());
    	
    	System.out.println("yourName: " + yourName.toString());
    	yourName.setLast("Brown");
    	System.out.println("yourName last name: " + yourName.toString());
 		someName.setName("John","Quincy","Adams");
 		System.out.println("someName last name: " + someName.toString());
 		
    }
    
    
}