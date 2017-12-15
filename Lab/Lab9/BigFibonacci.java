//Fibonacci Numbers -> Part 1
//By Charles Clark
//12-21-2015
//Beginner's Java

import java.math.*;
import java.util.Scanner;

public class BigFibonacci{
	//Main String for Big Fibonacci
	public static void main(String[] args) {

		int intLimit = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Please Enter A Value For I: ");
		intLimit = input.nextInt();

    	for (int i = 0; i < intLimit; i++) {
        	System.out.println(fibonacci(i));
		}
	}
	//Method Using Recursive to find fibonacci numbers
	public static BigInteger fibonacci(int n) {
    	if (n == 0 || n == 1) {
        	return BigInteger.ONE;
    	}
    	else {
    		return fibonacci(n - 2).add(fibonacci(n - 1));
    	}

	}
}