import java.util.Scanner;
/*
 switch(integral expression)
 	case (expression):
 		set of statements;
 		break;
 	case (expression):
 		set of statements;
 		break;
 	default:
 		set of statements;
*/
public class Chap16Part2 {
        
    public static void main(String[] args) {
    	char letter;
    	String letterGrade;
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter a letter grade: ");
    	letterGrade = input.nextLine();
    	letter = letterGrade.charAt(0);
    	switch(letter) {
    		case 'A':
    		case 'B':
    		case 'C':
    			System.out.println("Pass");
    			break;
    		case 'D':
    		default:
    			System.out.println("Fail");
    	}
    }
}
