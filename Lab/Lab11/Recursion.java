//Recursion
//By Charles Clark
//12-21-2015
//Beginner's Java


public class Recursion {

	public static String strConvertBinary;

    public Recursion() {

    }
    //Converts number into binary
    public static String getBinary(int intNumber) {

    	int intRemainder;

    	intRemainder = intNumber%2;

    	if(intNumber<2) {
    		strConvertBinary = "" + intNumber;
    		return strConvertBinary;

    	}
    	else {
    		if(intNumber != 0) {
    			getBinary(intNumber/2);
    			intRemainder = intNumber%2;
    			strConvertBinary += "" + intRemainder;
    		}
    	}
    	return strConvertBinary;

    }
	//Adds the sum of digits here
    public static int sumOfDigits(int intDigits) {
    	int sum;
    	if (intDigits == 0){
    		return intDigits;
    	}
    	else {
    		sum = intDigits % 10 + sumOfDigits(intDigits/10);
    	}
    	return sum;
    }
}