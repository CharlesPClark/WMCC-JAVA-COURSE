/**
 * @(#)ReaderTest.java
 *
 *
 * @author 
 * @version 1.00 2015/12/19
 */
 import java.io.*;
 import java.util.*;

public class ReaderText {
     	
   public static void main(String[] args) {
   	
   	try {
   	  BufferedReader in = new BufferedReader(new FileReader("cards.txt"));
   	  
      String line;
      
      while((line = in.readLine() ) != null) {
    	String[] lines = line.split(",");
    	System.out.println(lines[0] + "," + lines[1]);
    
    	
	  }
   } catch (IOException ex) {
   	System.out.println("File Not Found");
   }

   }   
}
