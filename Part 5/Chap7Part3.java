//Scanner Class - Numeric
//Importing 

//This Will Call The Scanner Class
//Java.util is a package where Scanner Class is
//To GET USER INPUT - USE SCANNER CLASS

import java.util.Scanner;

public class Chap7Part3 {

    public static void main(String[] args)
    {
    	//Declare Input As Scanner
    	//Call The Constructor
    	//System.in is the Input Data
    	Scanner input = new Scanner(System.in);
    	//Declare Integer as Number
    	int number;
    	
    	//Number Equals input
    	//nextInt will stop the command line
    	//nextInt Will Ask For A Integer Only
    	number = input.nextInt();
    	
    	//Print New Line
    	System.out.print("\n");
    	
    	//Print Number
    	System.out.println("The number is " + number);
    	
    	//Print New Line
    	System.out.print("\n");
    	
    	//-----------------------------------------------------------------------------------------------------
    	//Addition Program - Using Integer
    	int add1, add2, sum;
    	
    	//Ask For First Number
    	System.out.println("Choose The First Number:");
    	add1 = input.nextInt();
    	
    	//Print New Line
    	System.out.print("\n");
    	
    	//Ask For Second Number
    	System.out.println("Choose The Second Number:");
    	add2 = input.nextInt();
    	
    	//Print New Line
    	System.out.print("\n");
    	
    	sum = add1 + add2;
    	System.out.println(add1 + " + " + add2 + " = " + sum);
    	//----------------------------------------------------------------------------------------------------
    	
    	//Print New Line
    	System.out.print("\n");
    	
    	//Addition Program Part 2 - Using Double
    	double dadd1, dadd2, dsum;
    	
    	//Ask For First Number
    	System.out.println("Choose The First Number:");
    	dadd1 = input.nextDouble();
    	
    	//Print New Line
    	System.out.print("\n");
    	
    	//Ask For Second Number
    	System.out.println("Choose The Second Number:");
    	dadd2 = input.nextDouble();
    	
    	//Print New Line
    	System.out.print("\n");
    	
    	dsum = dadd1 + dadd2;
    	System.out.println(dadd1 + " + " + dadd2 + " = " + dsum);	
    	
    	//MixedValues Are Valid For Certain Cases
    	//Cant't Assign Double to Int Variables - Loss Of Precision
    }
    
    
}