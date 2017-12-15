//Big Powers -> Part 2
//By Charles Clark
//12-21-2015
//Beginner's Java
import java.math.*;
import java.util.Scanner;

public class BigPowers {

	public static void main(String[] args) {

		BigInteger Bigx;
		BigInteger Bigi;


		Scanner input = new Scanner(System.in);

		System.out.print("Please Enter a value for x: ");
		Bigx = input.nextBigInteger();
		System.out.print("Please Enter a value for i: ");
		Bigi =input.nextBigInteger();

		//Calls BigInteger Method Power
        System.out.println(Power(Bigx,Bigi));

	}
	//Uses a recursive method to return Power Number
	public static BigInteger Power(BigInteger a, BigInteger exponent){

		if (exponent.equals(BigInteger.ONE))

			return a;

		else if (exponent.equals(BigInteger.ZERO))

			return BigInteger.ONE;

		else return a.multiply(Power(a,exponent.subtract(BigInteger.ONE)));

	}









}
