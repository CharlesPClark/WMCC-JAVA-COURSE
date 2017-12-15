//Count Controlled While Loop
//Count Has A Determined Value For Loops
//Always have a loop controlled variable
public class Chap9Part2 {
        
    public static void main(String[] args) {
    	//Balance, rate, number of years
    	double balance = 5000;

    	double rate = 1.02;
    	//Loop Controlled Variable
    	int year = 1;
    	//Test Loop Controlled Variable
    	while (year <= 10) {
    		balance = balance * rate; //balance *= rate;
    		System.out.print("After year " + year + " the balance is $");
    		System.out.printf("%.2f",balance);
    		System.out.println(".");
    		++year; //Statement That Will Increment Loop Controlled Variable
    	
    	}
    	//Make sure
    	System.out.print("After 10 years the balance is $");
    	System.out.printf("%.2f",balance);
    	System.out.println(".");
    }
}
