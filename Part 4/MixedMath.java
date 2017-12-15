public class MixedMath
{
	public static void main(String[] args)
	{
		//Mix Data Types - Line Intergers and Doubles
		double dnum;
		int num = 2;
		//This change 2 to 2.0 since dnum is double
		dnum = num;
		//This MIXING is allowed
		System.out.println(dnum);
		
		
		//Mix Data Error
		int num2;
		double dnum2 = 2;
		//Possible Loss Of Data
		//Compiler Will Deny
		num2 = dnum2;
		//Print Won't Work
		System.out.println(dnum2);
		
		//Mixed Data - Char and Num3
		int num3;
		//ASCII Value - Z = 122
		char c = 'z';
		//Num3 to C is Acceptable
		num3 = c;
		//Prints out 122
		System.out.println(num3);
		//Trying to Store A Double In Interger - Error
	}
}