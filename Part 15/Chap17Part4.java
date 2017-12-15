import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Chap17Part4 {

    public static void main(String[] args) throws IOException  {
    	String fileName = "grades.txt";
    	PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));  
    	Scanner input = new Scanner(System.in);
    	int grade = 0;
    	System.out.print("Enter a grade (-1 to quit): ");
    	grade = input.nextInt();
    	outFile.println();
    	while (grade != -1) {
    		outFile.println(grade);
    		grade = 0;
    		System.out.print("Enter a grade (-1 to quit): ");
    		grade = input.nextInt();
    	}
    	outFile.close();
    }
}
