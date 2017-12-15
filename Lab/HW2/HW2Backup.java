/**
 * @(#)HW1.java
 *
 *
 * @author 
 * @version 1.00 2015/12/18
 */
import java.util.*;

public class HW2 {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	String strSoldOut = "SOLD OUT";
    	
    	String strPosition1 = "Sour Patch";   
    	String strPosition2 = "Milky Way";
    	String strPosition3 = "LAYs Potato Chips";
    	String strPosition4 = "KitKat";
    	String strPosition5 = "Swedish Fish"; 
    	String strPosition6 = "Skittles";
    	String strPosition7 = "Junior Mints";
    	String strPosition8 = "Great Value Tortilla Chips";
    	String strPosition9 = "Cheetos";
    	String strPosition10 = "Fritos";
    	String strPosition11 = "Doritos";
    	String strPosition12 = "Santitas";
    	
    	double dblPosition1 = 1.00;
    	double dblPosition2 = 1.00;
    	double dblPosition3 = 1.00;
    	double dblPosition4 = 1.00;
    	double dblPosition5 = 1.00;
    	double dblPosition6 = 1.00;
    	double dblPosition7 = 1.00;
    	double dblPosition8 = 1.00;
    	double dblPosition9 = 1.00;
    	double dblPosition10 = 1.00;
    	double dblPosition11 = 1.00;
    	double dblPosition12 = 1.00;
    	
    	int intTotalPosition1 = 10;
    	int intTotalPosition2 = 10;
    	int intTotalPosition3 = 0;
    	int intTotalPosition4 = 10;
    	int intTotalPosition5 = 10;
    	int intTotalPosition6 = 10;
    	int intTotalPosition7 = 10;
    	int intTotalPosition8 = 0;
    	int intTotalPosition9 = 0;
    	int intTotalPosition10 = 0;
    	int intTotalPosition11 = 0;
    	int intTotalPosition12 = 0;             	
    
    	final double NICKEL = .05;
    	int intAmountNCredit = 0;
    	int intAmountNTotal = 0;
    	
    	final double DIME = .10;
    	int intAmountDCredit = 0;
    	int intAmountDTotal = 0;
    	
    	final double QUARTER = .25;
    	int intAmountQCredit = 0;
    	int intAmountQTotal = 0;
    	
    	final double DOLLAR = 1.00;
    	int intAmountDOCredit = 0;
    	int intAmountDOTotal = 0;
    
    	double dblCurrentCredit = 0.00;
    	double dblCardBalance = 0.00;
    	
    	int intChoice = 0;
    	
    do {
    	System.out.println("-----------------------------------------------");
    	System.out.println("Welcome to the Charles Clark Vending Machine.");
    	if (intTotalPosition1 == 0)
    		System.out.println("1. " + strSoldOut);
    	else {
    		System.out.println("1. " + strPosition1 + "Price: $");
    	}
    	if (intTotalPosition2 == 0)
    		System.out.println("2. " + strSoldOut);
    	else {
    		System.out.println("2. " + strPosition2);
    	}
    	if (intTotalPosition3 == 0)
    		System.out.println("3. " + strSoldOut);
    	else {
    		System.out.println("3. " + strPosition3);
    	}
    	if (intTotalPosition4 == 0)
    		System.out.println("4. " + strSoldOut);
    	else {
    		System.out.println("4. " + strPosition4);
    	}
    	if (intTotalPosition5 == 0)
    		System.out.println("5. " + strSoldOut);
    	else {
    		System.out.println("5. " + strPosition5);
    	}
    	if (intTotalPosition6 == 0)
    		System.out.println("6. " + strSoldOut);
    	else {
    		System.out.println("6. " + strPosition6);
    	}
    	if (intTotalPosition7 == 0)
    		System.out.println("7. " + strSoldOut);
    	else {
    		System.out.println("7. " + strPosition7);
    	}
    	if (intTotalPosition8 == 0)
    		System.out.println("8. " + strSoldOut);
    	else {
    		System.out.println("8. " + strPosition8);
    	}
    	if (intTotalPosition9 == 0)
    		System.out.println("9. " + strSoldOut);
    	else {
    		System.out.println("9. " + strPosition9);
    	}
    	if (intTotalPosition10 == 0)
    		System.out.println("10. " +strSoldOut);
    	else {
    		System.out.println("10. " + strPosition10);
    	}
    	if (intTotalPosition11 == 0)
    		System.out.println("11. " + strSoldOut);
    	else {
    		System.out.println("11. " + strPosition11);
    	}
    	if (intTotalPosition12 == 0)
    		System.out.println("12. " + strSoldOut);
    	else {
    		System.out.println("12. " + strPosition12);
    	}  	    	    	    	
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
    	
    	else if (intChoice == 2) {
    		System.out.println();
    		System.out.println("You have entered card number XXXX");
    		try {
    			Thread.sleep(2000);
			} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
			}
    	}
    	else if (intChoice == 3) {
    		intChoice = 0;
    		System.out.print("Please Choose a Purchase:");
    		intChoice = input.nextInt();
    		
    		 if (intChoice == 1) {
    			if (intTotalPosition1 != 0) {
    				if (dblCurrentCredit >= dblPosition1) {
    					dblCurrentCredit -= dblPosition1;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition1;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 2) {
    			if (intTotalPosition2 != 0) {
    				if (dblCurrentCredit >= dblPosition2) {
    					dblCurrentCredit -= dblPosition2;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition2;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 3) {
    			if (intTotalPosition3 != 0) {
    				if (dblCurrentCredit >= dblPosition3) {
    					dblCurrentCredit -= dblPosition3;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition3;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 4) {
    			if (intTotalPosition4 != 0) {
    				if (dblCurrentCredit >= dblPosition4) {
    					dblCurrentCredit -= dblPosition4;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition4;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 5) {
    			if (intTotalPosition5 != 0) {
    				if (dblCurrentCredit >= dblPosition5) {
    					dblCurrentCredit -= dblPosition5;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition5;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 6) {
    			if (intTotalPosition6 != 0) {
    				if (dblCurrentCredit >= dblPosition6) {
    					dblCurrentCredit -= dblPosition6;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition6;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 7) {
    			if (intTotalPosition7 != 0) {
    				if (dblCurrentCredit >= dblPosition7) {
    					dblCurrentCredit -= dblPosition7;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition7;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 8) {
    			if (intTotalPosition8 != 0) {
    				if (dblCurrentCredit >= dblPosition8) {
    					dblCurrentCredit -= dblPosition8;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition8;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 9) {
    			if (intTotalPosition9 != 0) {
    				if (dblCurrentCredit >= dblPosition9) {
    					dblCurrentCredit -= dblPosition9;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition9;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 10) {
    			if (intTotalPosition10 != 0) {
    				if (dblCurrentCredit >= dblPosition10) {
    					dblCurrentCredit -= dblPosition10;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition10;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 11) {
    			if (intTotalPosition11 != 0) {
    				if (dblCurrentCredit >= dblPosition11) {
    					dblCurrentCredit -= dblPosition11;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition11;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    	else if (intChoice == 12) {
    			if (intTotalPosition12 != 0) {
    				if (dblCurrentCredit >= dblPosition12) {
    					dblCurrentCredit -= dblPosition12;
    					System.out.println("Thank You For Your Purchase!");
    					--intTotalPosition12;
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
    		else {
    			System.out.println("Sold Out! We are Sorry!");
    			try {
    				Thread.sleep(2000);
				} catch(InterruptedException ex) {
    				Thread.currentThread().interrupt();
				}
    		}
    	}	
    }
    	else if (intChoice == 4) {
    		System.out.println("Giving Credit Back.");
    		dblCurrentCredit = 0.00;
    		try {
    			Thread.sleep(2000);
			} catch(InterruptedException ex) {
    			Thread.currentThread().interrupt();
			}  
    	}
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
    			System.out.println("You have chosen Empty Coins.");
    		}
    		else if(intChoice == 3) {
    			System.out.println();
    			System.out.println("-----------------------------------------------");
    			System.out.println("Vending Machine Stock");
    			
    			System.out.println("1)" + strPosition1 + " - Total:" + intTotalPosition1);
    			System.out.println("2)" + strPosition2 + " - Total:" + intTotalPosition2);
    			System.out.println("3)" + strPosition3 + " - Total:" + intTotalPosition3);
    			System.out.println("4)" + strPosition4 + " - Total:" + intTotalPosition4);
    			System.out.println("5)" + strPosition5 + " - Total:" + intTotalPosition5);
    			System.out.println("6)" + strPosition6 + " - Total:" + intTotalPosition6);
    			System.out.println("7)" + strPosition7 + " - Total:" + intTotalPosition7);
    			System.out.println("8)" + strPosition8 + " - Total:" + intTotalPosition8);
    			System.out.println("9)" + strPosition9 + " - Total:" + intTotalPosition9);
    			System.out.println("10)" + strPosition10 + " - Total:" + intTotalPosition10);
    			System.out.println("11)" + strPosition11 + " - Total:" + intTotalPosition11);
    			System.out.println("12)" + strPosition12 + " - Total:" + intTotalPosition12);
    			
    			System.out.print("Choose an Item to Load Into Vending Machine:");
    			intChoice = 0;
    			intChoice = input.nextInt();
    			
    			if (intChoice == 1) {
    				++intTotalPosition1;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 2) {
    				++intTotalPosition2;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 3) {
    				++intTotalPosition3;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 4) {
    				++intTotalPosition4;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 5) {
    				++intTotalPosition5;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 6) {
    				++intTotalPosition6;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 7) {
    				++intTotalPosition7;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 8) {
    				++intTotalPosition8;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 9) {
    				++intTotalPosition9;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 10) {
    				++intTotalPosition10;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 11) {
    				++intTotalPosition11;
    				System.out.println("Please Wait...Loading...");
    			}
    			else if (intChoice == 12) {
    				++intTotalPosition12;
    				System.out.println("Please Wait...Loading...");
    			}
    		}
    		else if(intChoice == 4) {
    			System.out.println();
    			System.out.println("-----------------------------------------------");
    			System.out.println("Vending Machine Pricing");
    			System.out.print("1)" + strPosition1 + " - Price: $");
    			System.out.printf("%.2f", dblPosition1);
    			System.out.print("2)" + strPosition2 + " - Price: $");
    			System.out.printf("%.2f", dblPosition2);
    			System.out.print("3)" + strPosition3 + " - Price: $");
    			System.out.printf("%.2f", dblPosition3);
    			System.out.print("4)" + strPosition4 + " - Price: $");
    			System.out.printf("%.2f", dblPosition4);
    			System.out.print("5)" + strPosition5 + " - Price: $");
    			System.out.printf("%.2f", dblPosition5);
    			System.out.print("6)" + strPosition6 + " - Price: $");
    			System.out.printf("%.2f", dblPosition6);
    			System.out.print("7)" + strPosition7 + " - Price: $");
    			System.out.printf("%.2f", dblPosition7);
    			System.out.print("8)" + strPosition8 + " - Price: $");
    			System.out.printf("%.2f", dblPosition8);
    			System.out.print("9)" + strPosition9 + " - Price: $");
    			System.out.printf("%.2f", dblPosition9);
    			System.out.print("10)" + strPosition10 + " - Price: $");
    			System.out.printf("%.2f", dblPosition10);
    			System.out.print("11)" + strPosition11 + " - Price: $");
    			System.out.printf("%.2f", dblPosition11);
    			System.out.print("12)" + strPosition12 + " - Price: $");
    			System.out.printf("%.2f", dblPosition12);
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
    
    

