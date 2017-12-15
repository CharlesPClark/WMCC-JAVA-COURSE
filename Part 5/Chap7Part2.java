//PrintF Function
//Find Field Width and Precision with PrintF
//PrintF is From C++ Code - Not Used In Java Much
public class Chap7Part2 {

    public static void main(String[] args)
    {
    	
    	final double pi = 3.14159263;
    	//PrintF
    	//Answer Should Be 3.1416
    	//Answer Will Show Only 4 decimal points
    	System.out.printf("pi = %.4f",pi);
    	//Print New Line
    	System.out.print("\n");
    	//Space Between Equal Sign and Value
    	//Should equal pi =        3.14159
    	System.out.printf("pi = %10.5f",pi);
    	//Print New Line
    	System.out.print("\n");
    	//Space Between Equal Sign and Value
    	//Should equal pi =                3.14159
    	System.out.printf("pi = %20.5f",pi);
    	//Print New Line
    	System.out.print("\n");
    	//Default is Six
    	System.out.printf("pi = %20f",pi);
    	
    }
    
}