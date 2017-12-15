import java.util.Scanner;

public class Chap10Part2 {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ftemp, ctemp;
        System.out.print("Enter a temperature in Fahrenheit: ");
        ftemp = input.nextDouble();
        ctemp = ftoc(ftemp);
        System.out.println(ftemp + "F is equal to " + ctemp + " C.");
        System.out.print("Enter a temperature in Celsius: ");
        ctemp = input.nextDouble();
        ftemp = ctof(ctemp);
        System.out.println(ctemp + "C is equal to " + ftemp + " F.");       
    }
    
    static double ftoc(double temp) {
    	double celsius;
    	celsius = (temp - 32.0) * (5.0 / 9.0);
    	return celsius;
    }
    
    static double  ctof(double temp) {
    	double fahrenheit;
    	fahrenheit = (temp * (9.0 / 5.0) + 32.0);
    	return fahrenheit;
    }
}
