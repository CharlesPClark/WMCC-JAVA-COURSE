//Homework Part 1
//By Charles Clark
//12-21-2015
//Beginner's Java

import java.util.*;

public class HW1 {

    public static void main(String[] args) {
    	
		//Scanner For User Input
    	Scanner input = new Scanner(System.in);
    	
		//String For Sold Out
    	String strSoldOut = "SOLD OUT";   
    	
		//Declare Double Variables For Vending
    	final double SOURPATCH = 1.00;
    	final double MILKYWAY = 1.00;
    	final double KITKAT = 1.00;
    	final double SWEDISHFISH = 1.00;
    	final double SKITTLES = 1.00;
    	final double JUNIORMINTS = 1.00;
    	
		//Variables for Coins
    	final double NICKEL = .05;
    	final double DIME = .10;
    	final double QUARTER = .25;
    	final double DOLLAR = 1.00;
		
		//Variable for Cash
    	double dblCurrentCredit = 0.00;
    	double dblCardBalance = 0.00;
    	
		//Input Choice
    	int intChoice = 0;
    
	//Loops the Vending Machine	
    do {
    	System.out.println("-----------------------------------------------");
    	System.out.println("Welcome to the Charles Clark Vending Machine.");
    	System.out.println("1. Sour Patch");
    	System.out.println("2. MilkyWay");
    	System.out.println("3. " + strSoldOut);
    	System.out.println("4. KitKat");
    	System.out.println("5. Swedish Fish");
    	System.out.println("6. Skittles");
    	System.out.println("7. Junior Mints");
    	System.out.println("8. " + strSoldOut);
    	System.out.println("9. " + strSoldOut);
    	System.out.println("10. " + strSoldOut);
    	System.out.println("11. " + strSoldOut);
    	System.out.println("12. " + strSoldOut);
    	System.out.println();
    	System.out.print("Current Credit: $");
    	System.out.printf("%.2f", dblCurrentCredit);
    	System.out.println();
    	
    	if (dblCardBalance == 0.00) {
    		System.out.println("Card Balance: INSERT CARD");
    	}
    	else {
    		System.out.print("Card Balance: $");
    		System.out.printf("%.2f", dblCardBalance);
    	}
		
		
    	System.out.println("ADDITIONAL STATUS INFORMATION HERE");
    	System.out.println("-----------------------------------------------");
    	System.out.println("Main Menu");
    	System.out.println();
    	System.out.println("1)Deposit Coin" + "\n" + "2)Insert Card"+ "\n" + "3)Purchase item"+ "\n" + "4)Cancel"+ "\n" + "5)Service Mode"+ "\n" + "6)End");
    	System.out.print("Choose The Following Options:");
    	intChoice = input.nextInt();
		//Choose a Menu/Option On Screen
    	if (intChoice == 1) {
    		do {
    			intChoice = 0;
    			System.out.println("-----------------------------------------------");
    			System.out.println("Insert Coin Menu");
    			System.out.println();
    			System.out.println("1)Nickel");
    			System.out.println("2)Dime");
    			System.out.println("3)Quarter");
    			System.out.println("4)Dollar");
    			System.out.println("5)Return To Main Menu");
    			System.out.println();
    			System.out.print("Current Credit: $");
    			System.out.printf("%.2f", dblCurrentCredit);
    			System.out.println();
    			System.out.print("Choose The Following Options:");
    			
    			intChoice = input.nextInt();
    			
    			if (intChoice == 1) {
    				++intAmountNCredit;
  					dblCurrentCredit += NICKEL;
    			}
    			else if (intChoice == 2) {
    				++intAmountDCredit;
    				dblCurrentCredit += DIME;
    			}
    			else if (intChoice == 3) {
    				++intAmountQCredit;
    				dblCurrentCredit += QUARTER;
    			}
    			else if (intChoice == 4) {
    				++intAmountDOCredit;
    				dblCurrentCredit += DOLLAR;
    			}
    			
    		} while (intChoice != 5);
    	}
    	//Says You have entered card number XXXX
    	else if (intChoice == 2) {
    		System.out.println();
    		System.out.println("You have entered card number XXXX");
    		try {
    			Thread.sleep(2000);
			} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
			}
    	}
		//Allows you to choose a purchase
    	else if (intChoice == 3) {
    		intChoice = 0;
    		System.out.print("Please Choose a Purchase:");
    		intChoice = input.nextInt();
    		
    		if (intChoice == 1) {
    			if (dblCurrentCredit >= SOURPATCH) {
    				dblCurrentCredit -= SOURPATCH;
    				System.out.println("Thank You For Your Purchase!");
	    			try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}
					    				
    			}
    			else {
    				System.out.println("Error! Not enough Credit!");
    				try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}  
    			}
    		}
    		else if (intChoice == 2) {
    			if (dblCurrentCredit >= MILKYWAY) {
    				dblCurrentCredit -= MILKYWAY;
    				System.out.println("Thank You For Your Purchase!");
	    			try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}    				
    			}
    			else {
    				System.out.println("Error! Not enough Credit!");
    				try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}  
    			}
    		}
    		else if (intChoice == 3) {
    			System.out.println("Sold Out!We are sorry.");
    		}
    		else if (intChoice == 4) {
    			if (dblCurrentCredit >= KITKAT){
    				dblCurrentCredit -= KITKAT;
    				System.out.println("Thank You For Your Purchase!");
	    			try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}    				
    			}
    			else {
    				System.out.println("Error! Not enough Credit!");
    				try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}  
    			}
    		}
    		else if (intChoice == 5) {
    			if (dblCurrentCredit >= SWEDISHFISH){
    				dblCurrentCredit -= SWEDISHFISH;
    				System.out.println("Thank You For Your Purchase!");
	    			try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}    				
    			}
    			else {
    				System.out.println("Error! Not enough Credit!");
    				try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}  
    			}
    		}
    		else if (intChoice == 6) {
    			if (dblCurrentCredit >= SKITTLES) {
    				dblCurrentCredit -= SKITTLES;
    				System.out.println("Thank You For Your Purchase!");
	    			try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}    				
    			}
    			else {
    				System.out.println("Error! Not enough Credit!");
    				try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}  
    			}
    		}
    		else if (intChoice == 7) {
    			if (dblCurrentCredit >= JUNIORMINTS) {
    				dblCurrentCredit -= JUNIORMINTS;
    				System.out.println("Thank You For Your Purchase!");
	    			try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}    				
    			}
    			else {
    				System.out.println("Error! Not enough Credit!");
    				try {
    					Thread.sleep(2000);
					} catch(InterruptedException ex) {
    					Thread.currentThread().interrupt();
					}  
    			}
    		}
    		else if (intChoice == 8) {
    			System.out.println("Sold Out!We are sorry.");
    		}
    		else if (intChoice == 9) {
    			System.out.println("Sold Out!We are sorry.");
    		}
    		else if (intChoice == 10) {
    			System.out.println("Sold Out!We are sorry.");
    		}
    		else if (intChoice == 11) {
    			System.out.println("Sold Out!We are sorry.");
    		}
    		else if (intChoice == 12) {
    			System.out.println("Sold Out!We are sorry.");
    		}
    			
    	}
		//Cancels and gives back change
    	else if (intChoice == 4) {
    		System.out.println("Giving Credit Back.");
    		dblCurrentCredit = 0.00;
    		try {
    			Thread.sleep(2000);
			} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
			}  
    	}
		//Displays Service Menu
    	else if (intChoice == 5) {
    		do {
				intChoice = 0;
				System.out.println("-----------------------------------------------");
				System.out.println("Service Mode");
				System.out.println();
				System.out.println("1)Loard Coin");
				System.out.println("2)Empty Coins");
				System.out.println("3)Load Item");
				System.out.println("4)Set Price");
				System.out.println("5)Finish");
				System.out.print("Choose The Following Options:");
    		
				intChoice = input.nextInt();
    		
				if (intChoice == 1) {
					System.out.println();
					System.out.println("You have chosen Load Coin.");
				}
				else if(intChoice == 2) {
					System.out.println();
					System.out.println("You have chosen Emptyu Coins.");
				}
				else if(intChoice == 3) {
					System.out.println();
					System.out.println("You have chosen Load Item.");
				}
				else if(intChoice == 4) {
					System.out.println();
					System.out.println("You have chosen Set Price.");
				}
    		
				try {
					Thread.sleep(2000);
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
    			
    		
    		} while (intChoice != 5);
    	}
    } while (intChoice != 6);
    
    	
    }
    
    
}