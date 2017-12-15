/*
 
while (relational expression){
	loop body
}

*/

//Make sure to increment/counter for the loop
public class Chap9Part1 {

    public static void main(String[] args) {
    
    //Checks Loop
    int count = 0;
    int number = 1;
    
    while (count < 5) {
   		System.out.println("Hello, World!");
   		++count; //<----Increments the Loop
    }
    	
    while(number <= 10) {
    	System.out.println(number);
    	++number;
    }
    	    
    	
    }
}
