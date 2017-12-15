//Scanner Class - String
//Importing
//The next Method Will Stop Till SPACE or ENTER KEY
//The nextLine Method Will Stop When ENTER Key

import java.util.Scanner;

public class Chap7Part4 {

    public static void main(String[] args)
    {
    	//Declare Variable
    	String name, name2;
    	
    	//Declare Input As Input - Sends To Constructor Scanner
    	Scanner input = new Scanner(System.in);
    	Scanner input2 = new Scanner(System.in);
    	
    	//PrintLine Method
    	System.out.print("Enter your namne: ");
    	
    	//Will Only Go Till Space Or Enter
    	name = input.next();
    	
    	//Print Out My Name
    	System.out.println("Your name is " + name);
    	
    	//Example 2
    
    	System.out.print("Enter your namne: ");
    	
    	//Will Only Go Till ENTER KEY
    	//Different From Method Nextzz
 
    	//This Method is nextLine
    	name2 = input2.nextLine();
    	
    	//Print Out My Name
    	System.out.println("Your name is " + name2);
    	
    	
    }
    
    
}