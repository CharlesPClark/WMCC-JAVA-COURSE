//Conditional Controlled While Loop

import java.util.Scanner;

public class Chap9Part3 {
	
    public static void main(String[] args) {
      	Scanner input = new Scanner(System.in);
      	int grade, total, count;
      	//Loops Require Variables to Be Initialize
      	total = 0;
      	count = 0;
      	double average = 0.0;
      	System.out.print("Enter a grade (-1 to quit): ");
      	grade = input.nextInt();
      	//Controlled until User Put -1 To Quit Loop
      	while (grade != -1) {
      		total += grade;
      		++count;
      		System.out.print("Enter a grade (-1 to quit): ");
      		grade = input.nextInt();
      	
      	}
      	average = total / count;
      	System.out.println("The average grade is " + average);
    }
}
