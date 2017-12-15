import java.util.Scanner;

public class Chap9Part9 {
	
    public static void main(String[] args) {
        Scanner inputNum1 = new Scanner(System.in);
        Scanner inputNum2 = new Scanner(System.in);
        Scanner inputOp = new Scanner(System.in);
        double num1, num2;
        String op;
        //To Break while(true) loop -> Use CONTROL+C
        while(true) {
        	System.out.print("First Number: ");
        	num1 = inputNum1.nextDouble();
        	System.out.print("Second Number: ");
        	num2 = inputNum2.nextDouble();
        	System.out.print("Operator: ");
        	op = inputOp.next();
        	if (op.equals("+"))
        		System.out.println(num1+num2);
        	else if (op.equals("-"))
        		System.out.println(num1-num2);
        	else if (op.equals("*"))
        		System.out.println(num1*num2);
        	else if (op.equals("/"))
        		System.out.println(num1/num2);	
        }
    }
}
