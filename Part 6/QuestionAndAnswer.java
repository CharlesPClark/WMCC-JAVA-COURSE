import java.util.Scanner;

public class QuestionAndAnswer
{
   public static void main(String[] args)
   {
  	Scanner input = new Scanner(System.in);
  	String answer = "Watson";
  	String response = "";
  	System.out.println("Let's play a guessing game. You get three tries.");
  	System.out.println("What was the name of the computer that played on Jeopardy? ");
  	response = input.nextLine();
  	//Nested IF - Two Nested IF
  	//Java Doesn't Like The Equal Sign
  	//Used String.equals(answer))
  	if (response.equals(answer))
 		System.out.println("That's right!");
 	else {
 		System.out.println("Sorry. Guess again: ");
 		response = input.nextLine();
 		if (response.equals(answer))
 			System.out.println("That's right!");
 			else {
 			System.out.println("Still not right. One more guess: ");
 			response = input.nextLine();
 				if (response.equals(answer))
 				System.out.println("That's right!");
 				else
 				System.out.println("Wrong! Better Luck Next Time! Answer is Watson.");
 				}
 		}
   }


}