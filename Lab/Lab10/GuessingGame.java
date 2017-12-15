//Guessing Game
//By Charles Clark
//12-21-2015
//Beginner's Java
import java.util.Scanner;
import java.util.*;

public class GuessingGame {

	private static int Min = 1;
	private static int Max = 100;

	private static int GameAmount;
	private static int PlayedGames;

	private static int RandomNumber;

	private static int Win;
	private static int Lose;

	private static int PlayerGuess;
	private static int LimitGuess = 8;
	private static int WrongGuess = 0;
	private static int TriesLeft;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome To Guessing Game.");
		System.out.println("How many times do you want to play?");
		//Check How Many Games and Looks For Exception
		do {
			try {
	
				GameAmount = input.nextInt();
	
	
			} catch (InputMismatchException e) {
				System.out.println("Please Enter A Valid Number!");
				input.next();
				GameAmount = 0;
				continue;
			} catch (IllegalArgumentException ex){
				System.out.println("Please Enter A Valid Number!");
				input.next();
				GameAmount = 0;
				continue;
			} catch (RuntimeException e) {
				System.out.println("Please Enter A Valid Number!");
				input.next();
				GameAmount = 0;
				continue;
			}
		} while (GameAmount == 0);
		//Creates a Random Number and Allow User to type a number in here
		do {
			
			Random r = new Random();
			RandomNumber = r.nextInt((Max - Min) + 1) + Min;
			System.out.println(RandomNumber);
		
			System.out.println("Enter A Guess Between 1 and 100.");
	
	 		do {
				do {
					try {
			
					PlayerGuess = input.nextInt();
		
					} catch (InputMismatchException e) {
						System.out.println("Please Enter A Number Between 1 and 100.");
						input.next();
						continue;
					} catch (IllegalArgumentException ex){
						System.out.println("Please Enter A Number Between 1 and 100.");
						input.next();
						continue;
					} catch (RuntimeException e) {
						System.out.println("Please Enter A Number Between 1 and 100.");
						input.next();
						continue;
					}
			
					if (PlayerGuess < 1 || PlayerGuess > 100) {
						System.out.println("Please Enter A Guess Between 1 and 100.");
					}
	
			    } while (PlayerGuess < 1 || PlayerGuess > 100);	
				
					if (PlayerGuess == RandomNumber) {
						System.out.println("Correct!");
					}
					else if (PlayerGuess > RandomNumber) {
						System.out.println("Wrong! The Number is Lower!");
						WrongGuess += 1;
						TriesLeft = LimitGuess - WrongGuess;
						System.out.println("You have " + TriesLeft + " tries left!");
						System.out.println("Please Enter A Number between 1 and 100! Again.");
					}
					else if (PlayerGuess < RandomNumber) {
						System.out.println("Wrong! The Number is Higher!");
						WrongGuess += 1;
						TriesLeft = LimitGuess - WrongGuess;
						System.out.println("You have " + TriesLeft + " tries left!");
						System.out.println("Please Enter A Number between 1 and 100! Again.");
					}
			
			
			
			
			
	 		} while (PlayerGuess != RandomNumber && WrongGuess != LimitGuess);
	 	
			PlayedGames += 1;
			//Checks if Player wins or loses round.
			if (PlayerGuess == RandomNumber) {
				System.out.println("You Won Round!");
				Win += 1;		
			}
			else if (WrongGuess == LimitGuess) {
				System.out.println("You Lose Round!");
				Lose += 1;				
			}	
			
			WrongGuess = 0;
			
		} while (PlayedGames != GameAmount);
		//checks if Player wins or loses The Game.
		if (Win > Lose) {
			System.out.println("Player Wins Game! " + Win + "-" + Lose);
		}	
		else if  (Win < Lose) {
			System.out.println("Player Loses Game! " + Win + "-" + Lose);
		}
		else if  (Win == Lose) {
			System.out.println("The Game is a Tie! " + Win + "-" + Lose);
		}
	}

}